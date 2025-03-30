/**
 * Main2: This class computes the mean value
 * of array items using a recursive summation method.
 */
public class Main2 {

    /**
     * Uses recursion to find the total of the first 'n' array elements.
     *
     * @param arr Array containing integers.
     * @param n Count of elements to sum (from start to n-1).
     * @return The cumulative sum of the specified elements.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static int recursiveSum(int[] arr, int n) {
        // Termination condition: return single element
        if (n == 1) {
            return arr[0];
        }

        // Combine current value with sum of previous elements
        return arr[n - 1] + recursiveSum(arr, n - 1);
    }

    /**
     * Determines the mean value using recursive summation.
     *
     * @param arr Integer array input.
     * @param n Element count.
     * @return Mean value as a double.
     */
    public static double findAverage(int[] arr, int n) {
        int sum = recursiveSum(arr, n);
        return (double) sum / n;
    }

    /**
     * Entry point – Executes mean calculation and tracks execution time.
     */
    public static void main(String[] args) {
        // Initialize test array
        int[] array = {3, 2, 4, 1};
        int n = array.length;

        // Record start time
        long startTime = System.nanoTime();

        // Compute mean via recursive method
        double average = findAverage(array, n);

        // Record end time
        long endTime = System.nanoTime();

        // Calculate duration in milliseconds
        double duration = (endTime - startTime) / 1_000_000.0;

        // Display results
        System.out.println("Mean value of elements: " + average);
        System.out.println("Execution time: " + duration + " ms");
    }
}