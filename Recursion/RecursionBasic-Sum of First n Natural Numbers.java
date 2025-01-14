public class Main {

    // Recursive method to calculate the sum of the first n natural numbers
    public static int SumofNatural(int n) {
        // Base case: If n is 1, return 1 since the sum of the first 1 natural number is 1
        if (n == 1) {
            return 1;
        }
        
        // Recursive call: Calculate the sum of the first (n-1) natural numbers
        int No = SumofNatural(n - 1);
        
        // Calculate the total sum by adding n to the result of the recursive call
        int No2 = n + (SumofNatural(n - 1)); // Note: This line is redundant as No already holds SumofNatural(n-1)

        // Return the computed sum
        return No2; // Should ideally return 'n + No' for efficiency
    }

    public static void main(String args[]) {
        // Define the number of natural numbers to sum
        int n = 5;

        // Call the recursive method and print the result
        System.out.println(SumofNatural(n)); // Expected output: 15
    }
}
