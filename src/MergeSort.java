public class MergeSort {

    public void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // Base case: the array is already sorted or empty
        }

        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        // Divide the array into two halves
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        // Recursively sort the two halves
        mergeSort(left);
        mergeSort(right);

        // Merge the two sorted halves
        merge(arr, left, right);
    }

    private void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Compare elements from left and right sub-arrays and merge them
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy any remaining elements from the left sub-array
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Copy any remaining elements from the right sub-array
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr);

        System.out.println("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
