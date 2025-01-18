public class Main {

    /**
     * This method performs a recursive search for the last index of the key in the array.
     * arr The array to search in.
     * key The value to search for.
     * i The current index in the array.
     *  The last index of the key if found, or -1 if not found.
     */
    public static int solve(int arr[], int key, int i) {
        // Base case: If the index reaches the end of the array, return -1.
        if (i == arr.length) {
            return -1;
        }
        
        // Recursive call: Check the next elements first.
        int lastIndex = solve(arr, key, i + 1);
        
        // If the key is found later, return that index.
        if (lastIndex != -1) {
            return lastIndex;
        }
        
        // If the current element matches the key, return the current index.
        if (arr[i] == key) {
            return i;
        }
        
        // If the key is not found at this index, return -1.
        return -1;
    }

    public static void main(String args[]) {
        // Define the input array and the key to search for.
        int arr[] = {1, 2, 3, 4, 3, 6};
        int key = 3;

        // Call the solve method to search for the key starting at index 0.
        int result = solve(arr, key, 0);

        // Print the result (last index of the key or -1 if not found).
        System.out.println(result);
    }
}
