/**
 * Main9: Calculates binomial coefficient C(n, k) using recursion.
 */
public class Main9 {

    /**
     * Calculates binomial coefficient C(n, k) recursively.
     *
     * @param n The total number of items.
     * @param k The number of items to choose.
     * @return The binomial coefficient C(n, k).
     *
     * Time Complexity: O(2^n) - Repeated recursive calls.
     * Space Complexity: O(n) - Recursion depth.
     */
    public static int binomialCoefficient(int n, int k) {
        // Base case: C(n, 0) = 1 and C(n, n) = 1.
        if (k == 0 || k == n) {
            return 1;
        }

        // Recursive case: C(n, k) = C(n-1, k-1) + C(n-1, k).
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }

    /**
     * Main method: Tests the binomial coefficient function and prints results.
     */
    public static void main(String[] args) {
        // Test values for n and k.
        int n1 = 2, k1 = 1;
        int n2 = 7, k2 = 3;

        // Start timing.
        long startTime = System.nanoTime();

        // Calculate binomial coefficients.
        int result1 = binomialCoefficient(n1, k1);
        int result2 = binomialCoefficient(n2, k2);

        // Stop timing.
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0;

        // Print results.
        System.out.println("C(" + n1 + ", " + k1 + ") = " + result1);
        System.out.println("C(" + n2 + ", " + k2 + ") = " + result2);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}