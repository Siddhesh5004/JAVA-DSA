
public class InsertionSort {
    public static void insertionSortDescending(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // To find the index where curr is to be inserted
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2}; // Example array, you can use any array you want
        System.out.println("Original array:");
        printArray(arr); // Helper method to print array
        insertionSortDescending(arr);
        System.out.println("Sorted array in descending order:");
        printArray(arr); // Helper method to print array
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
