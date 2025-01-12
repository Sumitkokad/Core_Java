public class Recursion {
    // This method prints numbers from 1 to n using recursion
    public static void PrintInc(int n) {
        // Base case: If n equals 1, print 1 and return
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        // Recursive call: Call the method with (n-1)
        PrintInc(n - 1);
        // Print the current number after the recursive call
        System.out.print(n + " ");
    }

    public static void main(String args[]) {
        // Initialize n with the value 10
        int n = 10;
        // Call the recursive method 'a' with n
        PrintInc(n);
    }
}
