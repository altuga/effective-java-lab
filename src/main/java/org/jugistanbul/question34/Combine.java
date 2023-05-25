package org.jugistanbul.question34;


/*
TODO
 1 - Measure time in microseconds of String concatenation operation
 2 - What are the alternative approaches for String concatenation operation?
*/

public class Combine {


    public static void main(String[] args) {
        int count = 1000;
        String str = "";

        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            // str = str + "core"; // String concatenation
            stringBuilder.append(str);
        }
        System.out.println(stringBuilder);


    }
}
