public class main {
    public static void subarray(int numbers[]) {
        int maxsum = Integer.MIN_VALUE;  // Initialize to the smallest possible value
        int minsum = Integer.MAX_VALUE;  // Initialize to the largest possible value

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0;

                // Print the subarray and calculate the sum
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];  // Add current element to sum
                }

                System.out.println("=> Sum: " + sum);

                // Update maxsum and minsum
                if (sum > maxsum) {
                    maxsum = sum;
                }
                if (sum < minsum) {
                    minsum = sum;
                }

                System.out.println();  // Formatting
            }
            System.out.println();  // Formatting
        }

        // Print the maximum and minimum subarray sums
        System.out.println("The maximum sum is " + maxsum);
        System.out.println("The minimum sum is " + minsum);
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        subarray(numbers);
    }
}
