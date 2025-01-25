public class Main {

    // This method generates and prints a pyramid pattern of '*' for a given number of rows (n)
    public static void Pyramidepattern(int n) {
        // Outer loop to handle the number of rows
        for (int i = 1; i <= n; i++) {
            // Inner loop to handle the number of '*' in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print '*' without moving to the next line
            }
            System.out.println(); // Move to the next line after printing all '*' in the current row
        }
    }

    // Main method: Entry point of the program
    public static void main(String args[]) {
        // Call the Pyramidepattern method to print a pyramid with 4 rows
        Pyramidepattern(4);
    }
}
