
public class BinomialCoeff {

    public static int factorial(int n){

        int f =1;

        for(int i =1 ;i<=n;i++){
            f= f*i;
        }
        return f;
    }
    
    public static int BinoCoeff(int n ,int r){

        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int BinoCoeff = fact_n / (fact_nmr * fact_r);
        return BinoCoeff;
    }
    public static void main(String[] args) {
     System.out.println(BinoCoeff(5, 2));
        
    }
}
