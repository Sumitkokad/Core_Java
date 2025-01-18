import java.util.*;

public class Main {

    /**
     * This method calculates the dimensions (length and width) of a rectangle
     * that has the given area, such that:
     * 1. The product of length and width equals the area.
     * 2. The length is greater than or equal to the width (L >= W).
     * 3. The difference between length and width is minimized.
     *
     * @param area The target area of the rectangle.
     * @return An array containing [length, width].
     */
    public static int[] solve(int area) {
        // Start with the square root of the area to minimize the difference between length and width.
        int width = (int) Math.sqrt(area);
        
        // Decrement width until we find a divisor of the area.
        while (area % width != 0) {
            width--; // Try the next smaller width.
        }
        
        // Calculate the corresponding length for the valid width.
        int length = area / width;
        
        // Return the result as an array [length, width].
        return new int[]{length, width};
    }

    public static void main(String args[]) {
        // Define the target area for the rectangle.
        int q = 88; // Example input area.

        // Call the solve method to calculate the rectangle dimensions.
        int result[] = solve(q);

        // Print the length and width of the rectangle.
        System.out.println(result[0] + "," + result[1]);
    }
}
