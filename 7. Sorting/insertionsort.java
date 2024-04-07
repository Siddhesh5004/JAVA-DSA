package 7. Sorting;

public class insertionsort {
    public static void insertionSortDescending(int arr[]) {

        for(int i=1; i<arr.length; i++) {
        int curr = arr[i];
        int prev = i-1;
        //to find the index where curr is to be inserted
        while(prev >= 0 && arr[prev] < curr) {
        arr[prev+1] = arr[prev];
        prev--;
        }
        arr[prev+1] = curr;
        }
        }
        
   
}
