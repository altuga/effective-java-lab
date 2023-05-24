package org.jugistanbul.question21;

/**
 * TODO
 * 1 - How to calculate your weight on all eight planets - 5 minutes
 * 2 - Instructor will show the solutions
 * 3 - What is the lesson ?
 */

class Value {
    int value;

    public Value(int value) {
        this.value = value;
    }
}

public class Main {

    public static void mainx(String[] args) {

        /**
         * If your Weight is 80 KG on Earth then what will be on Mars? Or Uranus ? ...
         */
        double earthWeight = Double.parseDouble("80");

        double result = Calculator.calculateSurfaceWeight(Calculator.JUPITER_REDIUS,
                Calculator.JUPITER_REDIUS, earthWeight);
        System.out.println("Weight on EARTH = " + result);
        Value value = new Value(39);
        calculate(value);
        value.value = 48;

        /**
         * for (Planets p ...) {
         * .......
         * System.out.printf ...
         * }
         */
    }

    public static void main(String[] args) {
        double earthWeight = Double.parseDouble("80");
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values())
            System.out.printf("Weight on %s is %f%n",
                    p, p.surfaceWeight(mass));
    }

    public static double calculate(Value value) {
        System.out.println(value);
        return 34.2;
    }

}
