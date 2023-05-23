package org.jugistanbul.question05;

public class RecordWorld {

    public static void main(String[] args) {
       //var go = record Go(String keyx, String valuex) {};

        var pair = new Pair("Hello", "World");

        System.out.println(pair.key() + " " + pair.value()
                +" " + pair.calculate());

         pair = new Pair("Hello", "Mars");
    }
}
