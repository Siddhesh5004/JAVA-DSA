package Functions;

import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num;

        System.out.println("Enter an integer: ");

        num = scn.nextInt();

        if (isEven(num)) {
            System.out.println("Number is even ");

        } else {
            System.out.println("Number is odd ");
        }
    }

    public static boolean isEven(int no) {
        if (no % 2 == 0) {
            return true;

        } else {
            return false;
        }
       
    }
}
