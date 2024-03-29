package Functions;

import java.util.Scanner;

public class Answer1 {

    public static void main(String[] args) {
        Scanner scn=new Scanner (System.in);
        
        System.out.println("input no 1 : ");

        int x=scn.nextInt();
        System.out.println("Input no 2: ");

        int y=scn.nextInt();
        System.out.println("Input the no 3: ");

        int z=scn.nextInt();
        System.out.println("Average of nos is:" +avgof3nos(x,y,z));
        scn.close();
    }
    
    

    public static int avgof3nos(int x,int y,int z){
        return (x+y+z)/3;

    }
   
}
