public class nosInDecOrder {
    public static void printDec(int n) {
        if (n == 0) { // Base case
            return;
        }
        System.out.print(n + " "); // Print the current number
        printDec(n - 1); // Recursive call with n-1
    }

    public static void main(String[] args) {
        int n = 10;
        printDec(n); // Call the method with n
    }
}


