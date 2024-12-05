
public class pairsinarr {

    public static void printPairs(int numbers[]) {

        int totalpairs = 0;
        

        for(int i = 0;i<numbers.length;i++){
            int curr = numbers[i]; 
            for(int j=i+1; j<numbers.length;j++){
                System.out.print("("+curr +","+ numbers[j] + ")");
            totalpairs++;
            }
            System.out.println();
        }
        System.out.println("total number of pairs are " + totalpairs);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 4, 5, 6 };
        printPairs(numbers);
    }
}

// for total number of pairs
/// tp = n(n-1)/2
