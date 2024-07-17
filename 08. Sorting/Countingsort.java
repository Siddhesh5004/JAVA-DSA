
public class Countingsort {
    public static void countingSortDescending(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 1, 2 }; // Example array, you can use any array you want
        System.out.println("Original array:");
        printArray(arr); // Helper method to print array
        countingSortDescending(arr);
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
