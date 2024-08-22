package org.jugistanbul.question46;

public class HttpServletRequest {
    public String getParameter(String username) {
        return "random";
    }

    public String[] getCookies() {
            return "mycookies".split(",");
    }

    public HttpSession getSession() {
        return new HttpSession();
    }

    public HttpSession getSession(boolean b) {
        return new HttpSession();
    }
}
