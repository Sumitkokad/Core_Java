public class Main {
    public static int largestIndex(int arr[]) {
        int large = Integer.MIN_VALUE;
        int index = -1; // To store the index of the largest element

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i]; // Update the largest value
                index = i; // Update the index of the largest value
            }
        }
        return index; // Return the index of the largest element
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 6, 4};
        int index = largestIndex(arr);
        System.out.println("The largest value is " + arr[index] + " at index " + index);
    }
}
