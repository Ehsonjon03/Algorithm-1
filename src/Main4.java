/**
 * Main4: This class calculates the factorial (n!) of a number using recursion.
 */
public class Main4 {

    /**
     * Recursively computes the factorial of a number.
     *
     * @param n The number to calculate the factorial of.
     * @return The factorial of n (n!).
     *
     * Time Complexity: O(n) – Each recursive call reduces n by 1.
     * Space Complexity: O(n) – Due to the depth of the recursive call stack.
     */
    public static int factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }

        // Recursive case: n * factorial of (n - 1)
        return n * factorial(n - 1);
    }

    /**
     * Main method – Executes Task 4.
     * It calls the factorial function and prints the result along with the execution time.
     */
    public static void main(String[] args) {
        // Define the number to calculate the factorial for
        int n = 5;

        // Start timing the execution
        long startTime = System.nanoTime();

        // Compute the factorial using recursion
        int result = factorial(n);

        // End timing the execution
        long endTime = System.nanoTime();

        // Calculate and convert duration to milliseconds
        double duration = (endTime - startTime) / 1_000_000.0;

        // Display the factorial result and the time taken
        System.out.println("Factorial of " + n + " is: " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}
