/**
 * Various ways to use math operators in Java.
 *
 * @author Kevin Csiffary
 * @version 1.0
 * @since 2024-02-12
 */
final class MathOperators {
  /**
   * Number constants, 2.
   */
  static final int NUMBER_TWO = 2;

  /**
   * Number constants, 40.
   */
  static final int NUMBER_FORTY = 40;

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
    System.out.println("2 + 40 = " + (NUMBER_TWO + NUMBER_FORTY));
  }
}
