import java.util.Scanner;

public class Factorialofnumber {

    public static int Factorial(int n){
        int f = 1;

        for(int i=1;i<=n;i++){
            f = f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        sc.close();

        System.out.println("the fatorial of "+ n +"is" + Factorial(n));


    }
}
