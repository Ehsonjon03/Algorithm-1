/**
 * Main3: This class checks whether a number is prime using recursion.
 */
public class Main3 {

    /**
     * Determines if a number is prime by invoking a helper function.
     *
     * @param n The number to check for primality.
     * @return true if the number is prime, false if it is not.
     *
     * Time Complexity: O(√n)
     * Space Complexity: O(√n)
     */
    public static boolean isPrime(int n) {
        // Return false for numbers less than or equal to 1, as they aren't prime
        if (n <= 1) return false;

        // Start the recursive process with a divisor of 2
        return isPrimeHelper(n, 2);
    }

    /**
     * Recursively checks if a number is divisible by any number up to √n.
     *
     * @param n The number being checked.
     * @param divisor The current divisor to test for divisibility.
     * @return true if the number is prime (no divisors found), false if divisible by the divisor.
     */
    private static boolean isPrimeHelper(int n, int divisor) {
        // If divisor exceeds the square root of n, n is prime
        if (divisor * divisor > n) {
            return true;
        }

        // If divisible by the divisor, the number is not prime
        if (n % divisor == 0) {
            return false;
        }

        // Recursively check the next potential divisor
        return isPrimeHelper(n, divisor + 1);
    }

    /**
     * Main method – tests two numbers for primality and records execution time.
     */
    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 10;

        // Capture the start time of the process
        long startTime = System.nanoTime();

        // Check if num1 and num2 are prime
        boolean isNum1Prime = isPrime(num1);
        boolean isNum2Prime = isPrime(num2);

        // Capture the end time of the process
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0;

        // Output whether the numbers are prime and the time taken
        System.out.println(num1 + " is " + (isNum1Prime ? "Prime" : "Composite"));
        System.out.println(num2 + " is " + (isNum2Prime ? "Prime" : "Composite"));
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}
