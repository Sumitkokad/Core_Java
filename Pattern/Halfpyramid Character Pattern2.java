/*

A
A B A
A B C B A
A B C D C B A
A B C D E D C B A


*/

public class Main {
    public static void main(String[] args) {
        int n = 5; // Number of rows
        
        for (int i = 0; i < n; i++) {
            // Print increasing characters
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            
            // Print decreasing characters
            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char) ('A' + j) + " ");
            }
            
            System.out.println();
        }
    }
}
