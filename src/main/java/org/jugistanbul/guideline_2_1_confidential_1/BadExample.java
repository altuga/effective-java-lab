package org.jugistanbul.guideline_2_1_confidential_1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.Buffer;

public class BadExample {

    public void readConfigFileUnsafe(String fileName) throws IOException {
        // RISK: Eğer dosya bulunamazsa, hata mesajı tam dosya yolunu (örn.
        // /home/user/secret/...) içerir.
        // Bu istisna yakalanmadan yukarı fırlatılırsa, hassas yol bilgisi loglara veya
        // kullanıcıya gidebilir.
        FileInputStream fis = new FileInputStream(fileName);
        try (BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(fis))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                // ... dosya içeriğini işle ...
            }
        }
   


    }
}
