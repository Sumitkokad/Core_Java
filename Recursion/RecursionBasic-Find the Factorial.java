public class Recursion {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1); // Simplified calculation
    }

    public static void main(String args[]) {
        int n = 3;
        System.out.println(factorial(n)); // Outputs: 6
    }
}
