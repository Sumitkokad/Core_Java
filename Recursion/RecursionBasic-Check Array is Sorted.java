public class Main {

    // Recursive method to check if the array is sorted in non-decreasing order
    public static boolean check(int arr[], int i) {
        // Base case: If we reach the last element, the array is sorted
        if (i == arr.length - 1) {
            return true;
        }

        // If the current element is greater than the next, the array is not sorted
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        // Recursive call to check the rest of the array
        return check(arr, i + 1);
    }

    public static void main(String args[]) {
        // Example input array
        int arr[] = {1, 3, 4, 5};

        // Call the recursive check method and print the result
        System.out.println(check(arr, 0)); // Expected output: true
    }
}
