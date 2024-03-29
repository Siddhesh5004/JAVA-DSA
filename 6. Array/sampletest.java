import java.util.*;

public class sampletest {
    public static void main(String[] args) {
        
       int marks[]=new int[100];

      Scanner scn=new Scanner (System.in);
       marks[0]= scn.nextInt();
       marks[1]=scn.nextInt();
       marks[2]=scn.nextInt();

       System.out.println("phy : " +marks[0]);
       System.out.println("math : "+marks[1]);
       System.out.println("chem :"+marks[2]);
       
       marks[2]=marks[2]+1;
       System.out.println("chem :"+marks[2]);
       scn.close();

       System.out.println("arr length : "+marks.length);
    }
}
