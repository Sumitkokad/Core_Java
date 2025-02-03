/*
Process of mergesort divide the array with the help of mid and then store at temperory array 

                                [8, 7, 6, 5, 4, 3, 2, 1]
                               /                         \
                   [8, 7, 6, 5]                         [4, 3, 2, 1]
                   /           \                        /           \
              [8, 7]         [6, 5]              [4, 3]         [2, 1]
             /      \        /      \            /      \        /      \
          [8]      [7]    [6]      [5]        [4]      [3]    [2]      [1]
             \      /        \      /            \      /        \      /
              [7, 8]         [5, 6]              [3, 4]         [1, 2]
                   \           /                        \           /
                   [5, 6, 7, 8]                        [1, 2, 3, 4]
                               \                        /
                                [1, 2, 3, 4, 5, 6, 7, 8]




*/




public class Main {
    public static void mergesort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;

        mergesort(arr, si, mid);
        mergesort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;  // ✅ Correct initialization of j
        int k = 0;

        // Merge the two subarrays
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements from left subarray
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from right subarray
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp array back to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]) {
        int arr[] = {8, 7, 6, 5, 4, 3, 2, 1};
        mergesort(arr, 0, arr.length - 1);
        
        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
