package org.jugistanbul.question19;

import java.util.HashSet;
import java.util.Set;


/*
TODO
 1 - Compile Combiner.java
 2 - There are 2 warnings, can you spot the warnings ?
 3 - try to fix those 2 warnings.
*/
public class Combiner {

    public static <T> Set combine(Set<? extends T> s1, Set<? extends T> s2) {
        Set<T> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }

    // Simple program to exercise generic method
    public static void main(String[] args) {

        Set<Integer> ages = Set.of(44, 34, 21);
        Set<Double> doubles = Set.of(44.0, 34.9, 21.9);
        Set<Double> aflCio = combine(ages, doubles);
        System.out.println(aflCio);
    }
}