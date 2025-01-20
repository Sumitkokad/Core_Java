
/*
 * Time Complexity:
 * - The function uses a divide-and-conquer approach.
 * - In each recursive call, the problem size (n) is reduced by half.
 * - Thus, the recurrence relation is T(n) = T(n/2) + O(1), where O(1) accounts for multiplication operations.
 * - Solving this recurrence relation using the Master Theorem or by iteration gives T(n) = O(log n).
 * 
 * Space Complexity:
 * - The function uses the call stack for recursion.
 * - The maximum depth of the recursion tree is O(log n).
 */


public class Main {
    public static int power(int x, int n) {
        // Base case
        if (n == 0) {
            return 1;
        }

        // Recursive case for even power
        int xndivide2 = power(x, n / 2); // Recursive call
        int xndivide2sqr = xndivide2 * xndivide2;

        // For odd power
        if (n % 2 != 0) {
            xndivide2sqr = x * xndivide2sqr;
        }

        return xndivide2sqr;
    }

    public static void main(String args[]) {
        System.out.println(power(2, 10));
    }
}
