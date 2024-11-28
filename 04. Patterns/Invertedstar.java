public class Invertedstar {

    public static void main(String[] args) {

        int n = 7;
        for (int line = 1; line <= n; line++) {
        // Main logic is n-line+1 for inverted star pattern 
            for (int star = 1; star <= n - line + 1; star++) { 
                System.out.print("*");

            }
            System.out.println();
        }
    }
}