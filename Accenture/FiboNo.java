import java.util.Scanner;
public class FiboNo {

        // Function to calculate nth Fibonacci number using recursion
        static int fib(int n) {
            if (n <= 1){
                return n;
            }else{
            return fib(n - 1) + fib(n - 2);
        }}
    
        public static void main(String[] args) {
          
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int n = scanner.nextInt();
            
            System.out.println(fib(n));
            
            scanner.close();
        }
    }

    