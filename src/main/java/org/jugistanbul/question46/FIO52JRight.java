package org.jugistanbul.question46;

import java.util.Arrays;

// https://wiki.sei.cmu.edu/confluence/display/java/FIO52-J.+Do+not+store+unencrypted+sensitive+information+on+the+client+side

public class FIO52JRight {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) {

        // Validate input (omitted)

        String username = request.getParameter("username");
        char[] password = request.getParameter("password").toCharArray();
        boolean rememberMe = Boolean.valueOf(request.getParameter("rememberme"));
        LoginService loginService = new LoginServiceImpl();
        boolean validated = false;
        if (rememberMe) {
            if (request.getCookies()[0] != null &&
                    request.getCookies()[0] != null) {

                String[] value = request.getCookies()[0].split(";");

                if (value.length != 2) {
                    // Set error and return
                }

                if (!loginService.mappingExists(value[0], value[1])) {
                    // (username, random) pair is checked
                    // Set error and return
                }
            } else {
                validated = loginService.isUserValid(username, password);

                if (!validated) {
                    // Set error and return
                }
            }

            String newRandom = loginService.getRandomString(); // Secure Random
            // Reset the random every time
            loginService.mapUserForRememberMe(username, newRandom);  // Secure Random
            HttpSession session = request.getSession();
            session.invalidate();
            session = request.getSession(true);
            // Set session timeout to 15 minutes
            session.setMaxInactiveInterval(60 * 15);
            // Store user attribute and a random attribute in session scope
            session.setAttribute("user", loginService.getUsername());
            Cookie loginCookie =
                    new Cookie("rememberme", username + ";" + newRandom);
            loginCookie.setHttpOnly(true);
            loginCookie.setSecure(true);
            response.addCookie(loginCookie);
            // ... Forward to welcome page
        } else {
            // No remember-me functionality selected
            // ... Authenticate using isUserValid() and if failed, set error
        }
        Arrays.fill(password, ' ');
    }
}
