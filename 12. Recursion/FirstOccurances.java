import java.util.*;

public class FirstOccurances {

    public static int firstoccurance (int arr[],int key ,int i){

        if(i==arr.length){
            return -1;
        }
        if (arr[i]==key){
            return i;
        }

        return firstoccurance(arr, key, i+1);
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        // Initialize the array
        int arr[] = new int[n];

        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key to search:");
        int key = sc.nextInt();

        int result = firstoccurance(arr, key, 0);

        if (result != -1) {
            System.out.println("First occurrence of the key is at index: " + result);
        } else {
            System.out.println("Key not found in the array.");
        }
    }    
}
