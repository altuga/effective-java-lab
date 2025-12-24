package org.jugistanbul.guideline_0_5_fundamentals_5;

import java.nio.file.Path; 

public class SecureFileFactory {
    public SecureFile getFile(Path filePath, User user) {
        if (user.hasPermission(filePath)) {   // IMPORTANT
            return new SecureFileImpl(filePath);   
        }
        throw new SecurityException("Access denied");
    }
}