/**
 * Problem1: This class implements a solution to find the minimum
 * element in an array using recursion.
 */
public class Main1 {

    /**
     * Recursively searches for the minimum element in the array.
     *
     * @param arr The array of integers to examine.
     * @param n The number of elements to consider, from index 0 to n-1.
     * @return The smallest integer found in the array.
     *
     * Time Complexity: O(n) – Each recursive call processes one element.
     * Space Complexity: O(n) – Due to the recursive call stack.
     */
    public static int findMin(int[] arr, int n) {
        // Base case: If the array has only one element, it is the minimum
        if (n == 1) {
            return arr[0];
        }

        // Recursive step: Find the minimum of the first n-1 elements
        int minOfRest = findMin(arr, n - 1);

        // Compare the current element with the minimum of the rest
        return Math.min(arr[n - 1], minOfRest);
    }

    /**
     * Main method – The program's entry point.
     * It initializes the array, invokes the recursive function, and displays the result along with the execution time.
     */
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] array = {10, 1, 32, 3, 45};

        // Determine the total number of elements in the array
        int n = array.length;

        // Record the start time before invoking the recursive meth
        long startTime = System.nanoTime();

        // Call the recursive method to find the minimum value
        int min = findMin(array, n);

        // Record the end time after the method completes
        long endTime = System.nanoTime();

        // Calculate the time taken in milliseconds
        double duration = (endTime - startTime) / 1_000_000.0;

        // Print the minimum value and the time taken for the computation
        System.out.println("Minimum element is: " + min);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}

