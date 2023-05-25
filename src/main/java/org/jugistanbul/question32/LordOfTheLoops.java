package org.jugistanbul.question32;

import java.util.Iterator;
import java.util.List;

/*
TODO
 1 - Run the LordOfTheLoops.java
 2 - Did you spot the bug?
*/
public class LordOfTheLoops {

    public static void exec(List<String> names, List<Integer> ages) {
        Iterator<String> i = names.iterator();
        while (i.hasNext()) {
            System.out.println(" --> " + i.next() );
        }

        for (String name: names) {
            System.out.println(" --> " + name );
        }
       // name

        Iterator<Integer> i2 = ages.iterator();
        while (i2.hasNext()) {
            System.out.println(" --> " + i2.next());
        }
    }

    public static void main(String[] args) {

        List<String> names = List.of("Lurtz", "Saruman" , "Gollum" , "Boromir" , "Legolas");
        List<Integer> ages  = List.of(40, 50, 160, 65, 1040);

        exec(names, ages);

    }

}
