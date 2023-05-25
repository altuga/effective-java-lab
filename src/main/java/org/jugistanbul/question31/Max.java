package org.jugistanbul.question31;

import java.util.*;

/*
TODO
 1 - Run the Max.java
 2 - Is this the best way for max() method?
 3 - Instructor will show the solutions
 4 - What is the lesson  ?
*/
public class Max {



    // Returns maximum value in collection - throws exception if empty
    public static Optional<String> max(Collection<String> collection) {
        if (collection == null || collection.isEmpty())
            return Optional.empty();
            //throw new IllegalArgumentException("Empty collection");

        String result = null;
        for (String e : collection) {
            if (result == null || result.compareTo(e) > 0)
                result = Objects.requireNonNull(e);
        }


        return  Optional.of(result);
    }



    public static void main(String[] args) {
        List<String> words = Arrays.asList("");

        System.out.println(max(words).orElse("No output"));


    }
}
