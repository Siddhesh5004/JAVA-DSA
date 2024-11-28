import java.util.Scanner;

public class Printreverseofnumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        int lastDigit =0 ;
        while(n>0){
            lastDigit = n % 10 ;
            System.out.print(lastDigit);
            n =n/10;
        }
        System.out.println();
    }
}
