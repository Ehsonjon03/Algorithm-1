/**
 * Main10: This class calculates the Greatest Common Divisor (GCD) of two numbers
 * using recursion and the Euclidean Algorithm.
 */
public class Main10 {

    /**
     * Recursively computes the GCD of two integers using the Euclidean Algorithm.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The GCD of a and b.
     *
     * Time Complexity: O(log(min(a, b))) - Efficient logarithmic time.
     * Space Complexity: O(log(min(a, b))) - Due to recursive call stack.
     */
    public static int gcd(int a, int b) {
        // Base case: If b is 0, the GCD is a.
        if (b == 0) {
            return a;
        }

        // Recursive step: GCD(a, b) = GCD(b, a % b).
        return gcd(b, a % b);
    }

    /**
     * Main method to demonstrate the GCD calculation with test cases.
     * It measures the execution time and prints the results.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Test case 1: GCD(32, 48)
        int a1 = 32, b1 = 48;

        // Test case 2: GCD(10, 7)
        int a2 = 10, b2 = 7;

        // Record the start time for performance measurement.
        long startTime = System.nanoTime();

        // Calculate the GCDs for the test cases.
        int result1 = gcd(a1, b1);
        int result2 = gcd(a2, b2);

        // Record the end time for performance measurement.
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0; // Convert nanoseconds to milliseconds.

        // Print the GCD results.
        System.out.println("GCD of " + a1 + " and " + b1 + " is: " + result1);
        System.out.println("GCD of " + a2 + " and " + b2 + " is: " + result2);

        // Print the execution time.
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}