package org.jugistanbul.question35;


/*
TODO
 1 - What is wrong in this class ?

*/
public class Translate {

    public static String processStrings(String[] strings) {

        //int i = 0;
        String result = "";
        // try {

        for (int i = 0; i < strings.length; i++) {
            result = result.concat(processSingleString(strings[i]));
        }
        // while (true) {
        //     result = result.concat(processSingleString(strings[i]));
        //     i++;
        // }
        // } catch (ArrayIndexOutOfBoundsException e) {
        // Ignore, we're done
        // }
        return result;
    }

    private static String processSingleString(String string) {

        return string + "*";
    }

    public static void main(String[] args) {

        System.out.println(processStrings(args));
    }
}
