
import java.util.*;
public class largestNum {
    
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest =Integer.MAX_VALUE; // + inginity
        

        for(int i=0;i<numbers.length;i++){ // BigO(n)
            if(largest <numbers [i]){
                largest =numbers[i];
        }
        if (smallest>numbers[i]) {
            smallest = numbers[i];
        }
        }
        System.out.println("smallest value is " + smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,20,10}  ;
        System.out.println("largest value is "+getLargest(numbers));
    }
}
