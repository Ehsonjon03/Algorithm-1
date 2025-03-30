import java.util.Scanner;

/**
 * Main7: Reverses a sequence of integers using recursion, without arrays.
 */
public class Main7 {

    /**
     * Reads and prints integers in reverse order recursively.
     *
     * @param n       The number of integers to read.
     * @param scanner The Scanner object for input.
     *
     * Time Complexity: O(n) - One recursive call per integer.
     * Space Complexity: O(n) - Due to recursive call stack.
     */
    public static void reverseInput(int n, Scanner scanner) {
        // Base case: Stop recursion when no more integers to read.
        if (n == 0) {
            return;
        }

        // Read the next integer.
        int number = scanner.nextInt();

        // Recursively call the method before printing.
        reverseInput(n - 1, scanner);

        // Print the integer after the recursive call.
        System.out.print(number + " ");
    }

    /**
     * Main method: Entry point for Task 7.
     * Takes user input and prints the integers in reverse order.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of integers.
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        // Prompt the user to enter the integers.
        System.out.println("Enter " + n + " numbers:");

        // Record the start time.
        long startTime = System.nanoTime();

        // Reverse and print the integers.
        reverseInput(n, scanner);

        // Record the end time.
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0;

        // Display the execution time.
        System.out.println("\nTime taken: " + duration + " milliseconds");

        // Close the scanner.
        scanner.close();
    }
}