package org.jugistanbul.question29;


import java.util.List;

/*
TODO
 1 - Run the NumberOperation.java
 2 - Is this the best way for sum() and min() methods?
 3 - Instructor will show the solutions
 4 - What is the lesson  ?
*/
public class NumberOperation {

    static int sum(int... values ) {
        int sum = 0;
        for (int arg : values)
            sum += arg;
        return sum;
    }


    static int min(int first, int... args) {
        //if (args.length == 0)
        //    throw new IllegalArgumentException("Too few arguments");
        int min = first;
        for (int i = 1; i < args.length; i++)
            if (args[i] < min)
                min = args[i];
        return min;
    }


    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(min(1,2,4,5,6,4,0));
    }
}
