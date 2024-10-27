import java.util.*;

public class Main {
    // Function to find both the smallest and largest element in the 2D array
    public static void findSmallestAndLargest(int matrix[][]) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j]; // Update smallest
                }
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j]; // Update largest
                }
            }
        }

        System.out.println("The smallest element is: " + smallest);
        System.out.println("The largest element is: " + largest);
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        // Input numbers into the 2D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Enter the input numbers:");
                matrix[i][j] = sc.nextInt();
            }
        }

        // Display the input matrix
        System.out.println("The input matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Call the function to find the smallest and largest elements
        findSmallestAndLargest(matrix);
    }
}
