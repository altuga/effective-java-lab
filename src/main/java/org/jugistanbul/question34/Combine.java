package org.jugistanbul.question34;


/*
TODO
 1 - Measure time in microseconds of String concatenation operation
 2 - What are the alternative approaches for String concatenation operation?
*/

import java.util.StringJoiner;

public class Combine {


    public static void main(String[] args) {
        int count = 1000;
        String str = "";

        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < count; i++) {
            //str = str + "core"; // String concatenation
            // stringBuffer.append("core");
            stringBuilder.append("core");
        }


    }
}
