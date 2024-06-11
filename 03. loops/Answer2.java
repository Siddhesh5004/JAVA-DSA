
import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num; // To hold number
        int fact = 1; // To hold factorial
        System.out.print("Enter any positive integer: ");
        num = scn.nextInt();
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
        scn.close();
    }
}
