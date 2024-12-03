package Functions;

public class Answer1 {

    public static int Avgof3nos(int a , int b, int c){
        int avg = 0;
        avg = ( a + b + c ) /3;
        return avg;
    }
    public static void main(String[] args) {
        System.out.println(Avgof3nos(5, 5, 5));
    }
}
