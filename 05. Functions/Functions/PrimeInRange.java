

public class PrimeInRange {

    public static void range(int n){
        for(int i=2;i<n;i++){ // Prime number starts from 2
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        
        for(int i=2;i<=n-1;i++){ //prime number starts from 2
            if(n % i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        range(50);
    }
}
