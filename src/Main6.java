/**
 * Main6: This class solves the problem of computing "a" raised to the power of "n" (aⁿ)
 * using a recursive method.
 */
public class Main6 {

    /**
     * This method calculates a raised to the power of n (a^n) through recursion.
     *
     * @param a The base number.
     * @param n The exponent.
     * @return The result of a raised to the power of n.
     *
     * Time Complexity: O(n) – One recursive call for each decrement of the exponent.
     * Space Complexity: O(n) – Due to the depth of the recursion.
     */
    public static int power(int a, int n) {
        // Base case: Any number raised to the power of 0 equals 1
        if (n == 0) {
            return 1;
        }

        // Recursive step: aⁿ = a * aⁿ⁻¹
        return a * power(a, n - 1);
    }

    /**
     * The main method serves as the entry point for Task 6.
     * It calls the power function and outputs the result along with the time taken.
     */
    public static void main(String[] args) {
        // Set the base (a) and exponent (n)
        int a = 2;
        int n = 10;

        // Begin timing the execution
        long startTime = System.nanoTime();

        // Compute a raised to the power of n using recursion
        int result = power(a, n);

        // End the timing
        long endTime = System.nanoTime();

        // Calculate the time taken in milliseconds
        double duration = (endTime - startTime) / 1_000_000.0;

        // Display the result and the execution time
        System.out.println(a + " raised to the power of " + n + " is: " + result);
        System.out.println("Execution time: " + duration + " milliseconds");
    }
}
