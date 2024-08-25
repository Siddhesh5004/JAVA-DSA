public class Selectionsort {
    public static void selectionSortDescending(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int maxPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[maxPos] < arr[j]) { // Condition modified to sort in descending order
                    maxPos = j;
                }
            }
            // swap
            int temp = arr[maxPos];
            arr[maxPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int arr[]) {
        System.out.println("Sorted arr is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        selectionSortDescending(arr);
        printArr(arr);
    }
}
