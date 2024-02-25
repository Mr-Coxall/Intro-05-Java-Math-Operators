/*
* This is a program that calculates the cooking time
* when type and quantity of the food is given.
*
* @author  Mr Coxall
* @version 1.0
* @since   2020-01-01
*/

import java.util.Scanner;

/**
* This is the microwave program.
*/
final class Microwave {
    /**
    * Number 2.
    */
    static final int TWO = 2;

    /**
    * Number 3.
    */
    static final int THREE = 3;

    /**
    * Number 60.
    */
    static final int SIXTY = 60;

    /**
    * For 2 items, multiply time by 1.5.
    */
    static final double PERCENTAGE_FOR_TWO = 1.5;

    /**
    * For 3 items, multiply time by 2.0.
    */
    static final int PERCENTAGE_FOR_THREE = 2;

    /**
    * For string "sub".
    */
    static final String SUB = "sub";

    /**
    * For string "pizza".
    */
    static final String PIZZA = "pizza";

    /**
    * For string "soup".
    */
    static final String SOUP = "soup";

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Microwave() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final int sub = 1;
        final double pizza = 0.75;
        final double soup = 1.75;
        final int maxQuantity = 3;
        final double timeIncrement = 0.5;
        final String foodType;
        final int quantity;
        double time;
        int cookTimeMinutes = 0;
        double cookTimeSeconds = 0;

        // input
        final Scanner typeInput = new Scanner(System.in);
        System.out.print("Are you heating sub, pizza, or soup?: ");

        foodType = typeInput.nextLine();

        if ((SUB.equals(foodType)) || (PIZZA.equals(foodType))
                        || (SOUP.equals(foodType))) {
            if (SUB.equals(foodType)) {
                time = sub;
            } else if (PIZZA.equals(foodType)) {
                time = pizza;
            } else {
                time = soup;
            }

            // input
            final Scanner quantityInput = new Scanner(System.in);
            System.out.print("How many " + foodType
                            + "(s) are you cooking?(max:3): ");
            try {
                quantity = quantityInput.nextInt();
                if (quantity <= maxQuantity && quantity > 0) {
                    final int loopCounter = 1;
                    final double totalIncrement = 0;

                    // calculate
                    if (quantity == TWO) {
                        time *= PERCENTAGE_FOR_TWO;
                    } else if (quantity == THREE) {
                        time *= PERCENTAGE_FOR_THREE;
                    }

                    cookTimeMinutes = (int) time;
                    cookTimeSeconds = (time * SIXTY) % SIXTY;

                    // output
                    System.out.println("The total cook time is "
                                        + cookTimeMinutes
                                        + " minutes and " + cookTimeSeconds
                                        + " seconds.");
                } else {
                    System.out.println("The maximum quantity of food is 3.");
                }
            } catch (java.util.InputMismatchException errorCode) {
                System.err.print("Please enter a number.");
            }
        } else {
            System.err.println("This microwave doesn't accept "
                                + foodType + ".");
        }
        System.out.println("\nDone.");
    }
}
