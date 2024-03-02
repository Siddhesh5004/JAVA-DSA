import java.util.Scanner;

public class Answer3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float pencil = scn.nextFloat();
        float pen = scn.nextFloat();
        float eraser = scn.nextFloat();

        float total = pencil + pen + eraser;

        System.out.println("Bill  is : Rs " + total);

        // add 18% tax on total cost/bill

        float newTotal = total + (0.18f * total);

        System.out.println("Final bill with 18% tax : Rs " + newTotal);

        scn.close();

    }
}