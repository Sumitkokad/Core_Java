public class Main {
    /**
     * This method removes duplicate characters from a given string.
     * It uses a recursive approach to process each character in the input string.
     * 
     * @param str       The input string from which duplicates need to be removed.
     * @param idx       The current index being processed in the input string.
     * @param newstring A StringBuilder object that holds the result string without duplicates.
     * @param map       A boolean array to track the occurrence of characters ('a' to 'z').
     */
    public static void removeduplicates(String str, int idx, StringBuilder newstring, boolean map[]) {
        // Base case: When the index reaches the length of the string, print the result.
        if (idx == str.length()) {
            System.out.println(newstring); // Output the final string without duplicates.
            return; // End the recursion.
        }

        // Extract the current character from the string.
        char currchar = str.charAt(idx);

        // Check if the character is already marked as seen in the boolean array.
        if (map[currchar - 'a'] == true) {
            // If it's a duplicate, skip this character and proceed to the next one.
            removeduplicates(str, idx + 1, newstring, map);
        } else {
            // If it's not a duplicate:
            // Mark the character as seen in the boolean array.
            map[currchar - 'a'] = true;

            // Append the current character to the result string (newstring).
            removeduplicates(str, idx + 1, newstring.append(currchar), map);
        }
    }

    public static void main(String args[]) {
        // Input string containing duplicate characters.
        String str = "aaplee";

        // Call the method to remove duplicates with the initial parameters:
        // 1. Input string (str)
        // 2. Starting index (0)
        // 3. An empty StringBuilder for the result string (newstring)
        // 4. A boolean array of size 26 to track occurrences of characters ('a' to 'z').
        removeduplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
