package org.jugistanbul.question21;


/**
 * TODO
 * 1 - How to calculate your  weight on all eight planets  - 5 minutes
 * 2 - Instructor will show the solutions
 * 3 - What is the lesson  ?
 */
public class Main {

    public static void main(String[] args) {

        /**
         * If your Weight is 80 KG on Earth then what will be on Mars? Or Uranus ? ...
         */
        double earthWeight = Double.parseDouble("80");

        double result = Calculator.
                calculateSurfaceWeight(Calculator.MARS_MASS,
                        Calculator.MARS_REDIUS, earthWeight);
        System.out.println("Weight on JUPITER = " + result);

        /**
         * for (Planets p  ...) {
         *   .......
         *    System.out.printf ...
         * }
         */
    }
}
