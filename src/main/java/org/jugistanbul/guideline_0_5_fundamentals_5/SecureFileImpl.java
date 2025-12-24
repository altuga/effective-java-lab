package org.jugistanbul.guideline_0_5_fundamentals_5;

import java.nio.file.Path; 


public class SecureFileImpl implements SecureFile {
    private final Path filePath;

    SecureFileImpl(Path filePath) {
        this.filePath = filePath;
    }

    @Override
    public void read() {
        // read file logic
    }

    @Override
    public void write(String data) {
        // write file logic
    }
}

