import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int side = scn.nextInt();

        int area = side * side;

        System.out.println("area of the square is:" + area);

        scn.close();
    }
}
