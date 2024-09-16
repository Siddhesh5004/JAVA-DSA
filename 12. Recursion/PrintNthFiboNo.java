public class PrintNthFiboNo {

    public static int fn(int n){
        if(n==0 || n==1){
            return n;
        }
        int fn1= fn(n-1);
        int fn2 =fn(n-2);

        return fn1+fn2;
    }
    public static void main(String[] args) {
        int n=25;
        System.out.println(fn(n));
    }
}