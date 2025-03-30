/**
 * Main5: This class addresses the problem of finding the n-th number in the Fibonacci sequence
 * through the use of recursion.
 */
public class Main5 {

    /**
     * This method computes the n-th Fibonacci number using recursion.
     *
     * @param n The index in the Fibonacci sequence (0-based).
     * @return The Fibonacci number at the n-th position.
     *
     * Time Complexity: O(2^n) – The recursion tree has overlapping subproblems.
     * Space Complexity: O(n) – Due to the depth of the recursive call stack.
     */
    public static int fibonacci(int n) {
        // Base case: The Fibonacci number at position 0 is 0
        if (n == 0) {
            return 0;
        }

        // Base case: The Fibonacci number at position 1 is 1
        if (n == 1) {
            return 1;
        }

        // Recursive step: Fibonacci(n) is the sum of Fibonacci(n-1) and Fibonacci(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * The main method serves as the starting point of the program.
     * It calculates the Fibonacci number at a specific index and measures the time taken for the calculation.
     */
    public static void main(String[] args) {
        // Set the index in the Fibonacci sequence to compute
        int n = 17;

        // Record the start time
        long startTime = System.nanoTime();

        // Call the recursive function to get the Fibonacci number
        int result = fibonacci(n);

        // Record the end time
        long endTime = System.nanoTime();

        // Calculate the elapsed time in milliseconds
        double duration = (endTime - startTime) / 1_000_000.0;

        // Display the Fibonacci number and the time taken
        System.out.println("The Fibonacci number at position " + n + " is: " + result);
        System.out.println("Execution time: " + duration + " milliseconds");
    }
}
