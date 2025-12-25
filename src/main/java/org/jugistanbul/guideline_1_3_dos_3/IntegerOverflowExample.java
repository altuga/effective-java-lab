package org.jugistanbul.guideline_1_3_dos_3;

public class IntegerOverflowExample {
    public static void main(String[] args) {
        // 1. Define two "big" positive numbers
        int bigNum1 = 2_000_000_000; // 2 Billion
        int bigNum2 = 2_000_000_000; // 2 Billion

        // 2. Perform addition
        int result = bigNum1 + bigNum2;

        // 3. Display the surprising result
        System.out.println("Big Number 1: " + bigNum1);
        System.out.println("Big Number 2: " + bigNum2);
        System.out.println("Result (Sum): " + result);

        // 4. Verify the "exceptional" condition
        if (result < bigNum1 && result < bigNum2) {
            System.out.println("Exception Confirmed: The result is smaller than the inputs!");
        }

    }
}
