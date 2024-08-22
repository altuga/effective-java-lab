package org.jugistanbul.question46;

import java.security.SecureRandom;

public class LoginService {
    public boolean isUserValid(String s, char[] charArray) {
        return true;
    }

    public boolean mappingExists(String s, String s1) {
        return true;
    }

    public String getRandomString() {
        return new SecureRandom().nextInt(1000) + "";
    }

    public void mapUserForRememberMe(String username, String newRandom) {
    }

    public String getUsername() {
        return getRandomString();
    }
}
