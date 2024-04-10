public class Bubblesort {
    public static void bubbleSortDescending(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] < arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 2}; // Example array, you can use any array you want
        System.out.println("Original array:");
        printArray(arr); // Helper method to print array
        bubbleSortDescending(arr);
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

