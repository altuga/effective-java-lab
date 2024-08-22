package org.jugistanbul.question45;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SensitiveDataLifetimeLimitRight {

    public static void main (String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your user name: ");
        String username = br.readLine();
        System.out.print("Enter your password:  ");
        String password = br.readLine();
        boolean isValidUser = verify(username, password.toCharArray());

        // Clear the password
        Arrays.fill(password.toCharArray(),' ');

        if (!isValidUser) {
            throw new SecurityException("Invalid Credentials");
        }

        // User is authorized, continue...
    }

    // Dummy verify method, always returns true
    private static final boolean verify(String username, char[] password) {
        return true;
    }
}
