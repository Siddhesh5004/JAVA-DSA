import java.util.*;

public class pairsinarr {

    public static void printPairs(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total no of pairs : " + tp);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 4, 5, 6, 7 };
        printPairs(numbers);
    }
}

// for total number of pairs
/// tp = n(n-1)/2
