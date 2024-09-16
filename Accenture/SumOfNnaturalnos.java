package Accenture;
import java.util.Scanner;
public class SumOfNnaturalnos {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        
        if (n < 1) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }
        int val = 1;
        int sum = 0;

        while (val <= n) {
            sum += val;
            val++;
        }

      
        System.out.println("Sum of numbers from 1 to " + n + " is " + sum);

    }
}


