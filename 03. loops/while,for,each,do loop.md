## FOLLOWING IS THE DIFFERENCE BETWEEN DIFFERENT TYPES OF LOOPS (WHILE AND FOR AND DO WHILE LOOP)

-------------------------------------------------
public class whileloop{

    public static void main(Strings args[]){

        int i=1;
        while(i<=5>){
            System.out.println("*****");
            i++;
        }
    }
}

-------------------------------------------------
public class forloop{

    public static void main (String args[]){

        for(int i=1; i<=5; i++) {
            System.out.println("*****");
        }
    }
}

-------------------------------------------------
public class dowhileloop{

    public static void main (String args[]){

         do {
            System.out.println(i);
            i++;
        } while (i <= 10);

    }
}

-------------------------------------------------

public class forEach{
    public static void main(String args[]){
        int ages[] = {1,2,3,4,5,6};
        for(int age : ages){                     //for each loop is used to store and print values from ages array to age array.
            System.out.print(" "+age+" ");
        }
    }
}
