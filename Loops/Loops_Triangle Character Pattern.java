/*

    1
   121
  12321
 1234321
123454321

*/


public class Main {
    public static void main(String args[]) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int k = i; k < n; k++) {
                System.out.print(" ");
            }
            // Print ascending numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print descending numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
