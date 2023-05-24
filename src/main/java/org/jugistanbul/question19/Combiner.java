package org.jugistanbul.question19;

import java.util.*;


/*
TODO
 1 - Compile Combiner.java
 2 - There are 2 warnings, can you spot the warnings ?
 3 - try to fix those 2 warnings.
*/
public class Combiner {

    public static <ING> List<ING> combineList(List<ING> s1, List<ING> s2) {
        List<ING> result = Collections.unmodifiableList(new ArrayList<>());

        result.addAll(s2);
        return result;
    }
    public static <ING> Set<ING> combine(Set<ING> s1, Set<ING> s2) {
        Set<ING> result = new HashSet<>(s1);
        result.addAll(s2);
        return result;
    }


    // Simple program to exercise generic method
    public static void main(String[] args) {
        Set<String> guys = Set.of("Tom", "Dick", "Harry");
        Set<Integer> ages = Set.of(44, 34, 21);
        Set<Integer> aflCio = combine(ages, ages);
        System.out.println(aflCio);
    }
}