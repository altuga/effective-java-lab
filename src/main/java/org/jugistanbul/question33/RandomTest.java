package org.jugistanbul.question33;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/*
TODO
 1 - Run the RandomTest.java
 2 - Did you spot the bug?
*/
public class RandomTest {

    public static void main(String[] args) {
        int sum = 0;
        Random rand = new Random(100);
        for(int x = 1; x < 100; x++){
            int num = ThreadLocalRandom.current().nextInt(1000); ;
            //SecureRandom
            sum += num;
            System.out.println("Random number:" + num);
        }
        //value never changes with repeated program executions.
        System.out.println("Sum: " + sum);

    }
}
