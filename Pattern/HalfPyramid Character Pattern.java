public class Main {
    // Method to print a character pattern
    public static void print(int n) {
        char ch = 'A'; // Initialize the character to 'A'

        // Outer loop to handle the number of rows
        for (int i = 1; i <= n; i++) {
            // Inner loop to handle the number of characters in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(ch); // Print the current character
                ch++; // Increment the character to the next one
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }

    // Main method to execute the program
    public static void main(String args[]) {
        print(4); // Call the method to print the pattern for n=4
    }
}

/*
### Dry Run ###
Input: n = 4

Initial values:
- ch = 'A' (ASCII value 65)
- Outer loop variable `i` (row number)
- Inner loop variable `j` (column number)

### Iterations:
Step 1 (i = 1):
- Inner loop: j = 1
  - Print ch = 'A'
  - Increment ch → 'B'
- Output: A

Step 2 (i = 2):
- Inner loop: j = 1, j = 2
  - Print ch = 'B', Increment ch → 'C'
  - Print ch = 'C', Increment ch → 'D'
- Output: AB

Step 3 (i = 3):
- Inner loop: j = 1, j = 2, j = 3
  - Print ch = 'D', Increment ch → 'E'
  - Print ch = 'E', Increment ch → 'F'
  - Print ch = 'F', Increment ch → 'G'
- Output: DEF

Step 4 (i = 4):
- Inner loop: j = 1, j = 2, j = 3, j = 4
  - Print ch = 'G', Increment ch → 'H'
  - Print ch = 'H', Increment ch → 'I'
  - Print ch = 'I', Increment ch → 'J'
  - Print ch = 'J', Increment ch → 'K'
- Output: GHIJ

### Final Output:
A
AB
DEF
GHIJ
*/
