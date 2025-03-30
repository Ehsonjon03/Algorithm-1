/**
 * Main8: Checks if a string contains only digits using recursion.
 */
public class Main8 {

    /**
     * Checks if all characters in a string are digits recursively.
     *
     * @param s     The string to check.
     * @param index The current character index.
     * @return true if all are digits, false otherwise.
     *
     * Time Complexity: O(n) - Recursive call per character.
     * Space Complexity: O(n) - Recursive call stack.
     */
    public static boolean isAllDigits(String s, int index) {
        // Base case: end of string, all are digits.
        if (index == s.length()) {
            return true;
        }

        // Check if current character is not a digit.
        if (!Character.isDigit(s.charAt(index))) {
            return false;
        }

        // Check next character recursively.
        return isAllDigits(s, index + 1);
    }

    /**
     * Main method: Tests the digit-checking function and prints results.
     */
    public static void main(String[] args) {
        // Test strings.
        String s1 = "123456";
        String s2 = "123a12";

        // Start timing.
        long startTime = System.nanoTime();

        // Check and print results.
        System.out.println(s1 + " → " + (isAllDigits(s1, 0) ? "Yes" : "No"));
        System.out.println(s2 + " → " + (isAllDigits(s2, 0) ? "Yes" : "No"));

        // End timing.
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0;

        // Print execution time.
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}