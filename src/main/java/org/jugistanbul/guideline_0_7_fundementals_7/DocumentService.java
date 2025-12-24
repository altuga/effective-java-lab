package org.jugistanbul.guideline_0_7_fundementals_7;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.AccessDeniedException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * A minimal service that reads and writes text documents on disk.
 *
 * <h2>Security</h2>
 * <ul>
 *   <li><b>Caller sensitivity:</b> Authorization decisions use the calling {@link User} identity.
 *       Do not pass elevated principals on behalf of untrusted code (see Guidelines 9‑8 to 9‑11).</li>
 *   <li><b>Required permissions:</b> Callers must have READ for {@link #readDocument(Path, User)}
 *       and WRITE for {@link #writeDocument(Path, String, User)}.</li>
 *   <li><b>Preconditions:</b> {@code path} must point to an intended file (no path traversal).
 *       The {@link User} argument must not be {@code null}.</li>
 *   <li><b>Postconditions:</b> Read returns the file's UTF‑8 text without modifying metadata.
 *       Write stores text as UTF‑8, creating the file if missing.</li>
 * </ul>
 *
 * <h2>Exceptions</h2>
 * <ul>
 *   <li><b>Checked:</b> {@link IOException} for I/O failures (including {@link AccessDeniedException}
 *       if filesystem ACLs deny access).</li>
 *   <li><b>Unchecked (domain-specific):</b> {@link SecurityException} if the caller lacks the required
 *       permission prior to performing I/O.</li>
 * </ul>
 */
public final class DocumentService {

    /**
     * Reads the file contents as a UTF‑8 string.
     *
     * <h3>Security</h3>
     * <ul>
     *   <li><b>Required permission:</b> READ on {@code path}.</li>
     *   <li><b>Caller sensitivity:</b> Uses provided {@link User} to authorize.</li>
     *   <li><b>Preconditions:</b> {@code path} and {@code user} are non-null and point to an intended file.</li>
     * </ul>
     *
     * @param path the document path (non-null)
     * @param user the caller identity used for authorization (non-null)
     * @return the file contents as UTF‑8 text
     * @throws NullPointerException if {@code path} or {@code user} is null
     * @throws SecurityException if the caller is not authorized to read
     * @throws IOException if an I/O error occurs during read
     */
    public String readDocument(Path path, User user) throws IOException {
        if (path == null || user == null) {
            throw new NullPointerException("path and user must be non-null");
        }
        if (!user.hasReadPermission(path)) {
            throw new SecurityException("Access denied: READ " + path);
        }
        byte[] bytes = Files.readAllBytes(path);
        return new String(bytes, StandardCharsets.UTF_8);
    }

    /**
     * Writes (overwrites) the given text to the file using UTF‑8. Creates the file if it does not exist.
     *
     * <h3>Security</h3>
     * <ul>
     *   <li><b>Required permission:</b> WRITE on {@code path}.</li>
     *   <li><b>Caller sensitivity:</b> Uses provided {@link User} to authorize.</li>
     *   <li><b>Preconditions:</b> {@code path}, {@code text}, and {@code user} are non-null.</li>
     *   <li><b>Postconditions:</b> On success, the file contains {@code text} encoded in UTF‑8.</li>
     * </ul>
     *
     * @param path the document path (non-null)
     * @param text the content to write (non-null)
     * @param user the caller identity used for authorization (non-null)
     * @throws NullPointerException if any parameter is null
     * @throws SecurityException if the caller is not authorized to write
     * @throws IOException if an I/O error occurs during write
     */
    public void writeDocument(Path path, String text, User user) throws IOException {
        if (path == null || text == null || user == null) {
            throw new NullPointerException("path, text, and user must be non-null");
        }
        if (!user.hasWritePermission(path)) {
            throw new SecurityException("Access denied: WRITE " + path);
        }
        Files.createDirectories(path.getParent());
        Files.writeString(path, text, StandardCharsets.UTF_8);
    }
}

/**
 * Minimal caller identity abstraction for permission checks.
 *
 * <h2>Security</h2>
 * <ul>
 *   <li>Implementations should make stable decisions during a single operation
 *       to reduce time-of-check/time-of-use (TOCTOU) issues.</li>
 *   <li>Avoid using untrusted configuration without validation.</li>
 * </ul>
 */
interface User {
    boolean hasReadPermission(Path path);
    boolean hasWritePermission(Path path);
}
