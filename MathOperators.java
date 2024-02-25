/**
 * Various ways to use math operators in Java.
 *
 * @author Kevin Csiffary
 * @version 1.0
 * @since 2024-02-12
 */
public final class MathOperators {
  /** Private constructor to prevent instantiation of this utility class. */
  private MathOperators() {
    // Prevents instantiation.
  }

  /**
   * Create main function.
   *
   * @param args Command line arguments.
   */
  public static void main(final String[] args) {
    // Does addition and outputs the result to the console.
    System.out.println("2 + 40 = " + (2 + 40));

    // Does subtraction and outputs the result to the console.
    System.out.println("6 - 9 = " + (6 - 9));

    // Does multiplication and outputs the result to the console.
    System.out.println("45 * 6 = " + (45 * 6));

    // Does division without decimal and outputs the result to the console.
    System.out.println("81 / 9 = " + (81 / 9));

    // Does division (float) and outputs the result to the console.
    System.out.println("Float\n10 / 6 = " + (10f / 6f));

    // Does division (double) and outputs the result to the console.
    System.out.println("Double\n100 / 3 = " + (100d / 3d));

    // Does exponents and outputs the result to the console.
    System.out.println("4^7 = " + Math.pow(4, 7));

    // Does square root and outputs the result to the console.
    System.out.println("√64 = " + Math.sqrt(64));

    // Does cube root and outputs the result to the console.
    System.out.println("∛125 = " + Math.cbrt(125));
  }
}
