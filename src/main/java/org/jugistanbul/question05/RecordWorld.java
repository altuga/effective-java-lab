package org.jugistanbul.question05;

public class RecordWorld {

    public static void main(String[] args) {
        //record Pair(String key, String value) {};

        var pair = new Pair("Hello", "World");

        System.out.println(pair.key() + " " + pair.value()
                +" " +  pair.calculate());
    }
}
