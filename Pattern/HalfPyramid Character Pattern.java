
/*
A
BC
DEF
GHIJ

*/


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

