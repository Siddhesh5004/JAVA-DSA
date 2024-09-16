//find the power of x^n 
// eg. power of 5^3 = 5*5*5 = 125 

import java.util.Scanner;

public class Powerxn {

    public static int power (int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        
        System.out.println("enter x : ");
        int x =sc.nextInt();

        System.out.println("Enter n");
        int n =sc.nextInt();

        System.out.println(power(x, n));
        sc.close();
    }
    
}
