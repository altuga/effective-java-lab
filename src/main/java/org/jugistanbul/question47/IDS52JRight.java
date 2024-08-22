package org.jugistanbul.question47;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


// https://wiki.sei.cmu.edu/confluence/display/java/IDS52-J.+Prevent+code+injection
public class IDS52JRight {

    private static void evalScript(String firstName) throws ScriptException {
        // Allow only alphanumeric and underscore chars in firstName
        // (modify if firstName may also include special characters)
        if (!firstName.matches("[\\w]*")) {
            // String does not match whitelisted characters
            throw new IllegalArgumentException();
        }

        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("javascript");
        engine.eval("print('"+ firstName + "')");
    }
}
