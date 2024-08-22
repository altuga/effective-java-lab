package org.jugistanbul.question47;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.BufferedWriter;
import java.io.FileWriter;


// https://wiki.sei.cmu.edu/confluence/display/java/IDS52-J.+Prevent+code+injection
public class IDS52JWrong {

    private static void evalScript(String firstName) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("javascript");
        engine.eval("print('"+ firstName + "')");
    }

    public static void main(String[] args) throws ScriptException {
        String input = """ 
        dummy\');
        var bw = new JavaImporter(java.io.BufferedWriter);
        var fw = new JavaImporter(java.io.FileWriter);
        with(fw) with(bw) {
            bwr = new BufferedWriter(new FileWriter(\"config.cfg\"));
                    bwr.write(\"some text\"); bwr.close();
        """;

        evalScript(input);
    }
}
