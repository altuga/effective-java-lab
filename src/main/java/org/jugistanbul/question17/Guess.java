package org.jugistanbul.question17;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


/*
TODO
 1 - Run the Guess app
 2 - Any abnormality ? Please try to fix it
 3 - Instructor will show the solutions
 4 - What is the lesson  ?
*/

public class Guess<T> {
    private final List<T> choiceArray;

    public Guess(Collection<T> choices) {
        choiceArray = choices.stream().toList();
    }
    public T choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceArray.get(rnd.nextInt(choiceArray.size()));

    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6);

        List<String> stringList = List.of("one", "two", "three", "four", "five", "six");

        Guess<Integer> guess = new Guess(intList);

        for (int i = 0; i < 10; i++) {
            int choice =  guess.choose();
            System.out.println(choice);
        }

        Guess<String> guessString = new Guess(stringList);

        for (int i = 0; i < 10; i++) {
            String choice =  guessString.choose();
            System.out.println(choice);
        }

    }
}
