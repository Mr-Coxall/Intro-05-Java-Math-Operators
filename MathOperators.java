/*
* Various ways to use math operators in Java.
*
* @author Kevin Csiffary
* @version 1.0
* @since 2024-02-12
*/

/**
* This is the microwave program.
*/
final class MathOperators {
    /**
    * Number 2.
    */
    static final int NUMBER_TWO = 2;

    /**
    * Number 40.
    */
    static final int NUMBER_FORTY = 40;

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private MathOperators() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Does addition and outputs the result to the console.
        System.out.println("2 + 40 = " + (NUMBER_TWO + NUMBER_FORTY));

        System.out.println("\nDone.");
    }
}
