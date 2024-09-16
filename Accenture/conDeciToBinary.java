
// public class conDeciToBinary {
//     public static int countsetBits(int num){
//         int count =0;

//         while(num>0){
//             count+=(num&1);

//             num>>=1;
//         }
//         return count;
//     }


    
//     public static void main(String[] args) {
//         int decimalNumber = 10;
//         int sumOfBits = countsetBits(decimalNumber);
//         System.out.println("Sum of bits is "+ sumOfBits );

//     }
// }


import java.util.Scanner;
public class conDeciToBinary {

        public static void main(String[] args) {
          
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter an integer: ");
            int n = scanner.nextInt();
    
            // Initialize the sum to 0
            int sum = 0;
    
            // Calculate the sum of bits
            while (n > 0) {
                sum += n % 2;
                n /= 2;
            }
    
            // Output the result
            System.out.println("Sum of bits is " + sum);
    
            // Close the scanner to free resources
            scanner.close();
        }
    }
    

