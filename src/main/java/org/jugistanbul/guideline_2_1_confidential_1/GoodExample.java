package org.jugistanbul.guideline_2_1_confidential_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GoodExample {

    public void readConfigFileSafe(String fileName) throws IOException {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            // Dosya okuma işlemleri...
        } catch (FileNotFoundException e) {
            // HASSAS BİLGİ TEMİZLİĞİ:
            // Orijinal hata mesajı (dosya yolu) yutulur.
            // Yerine güvenli, genel bir mesaj fırlatılır.
            throw new IOException("Konfigürasyon dosyası yüklenemedi.");
        }

    }
}
