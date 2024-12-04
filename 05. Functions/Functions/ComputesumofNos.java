
public class ComputesumofNos {        
        public static int computeSumOfDigits(int number) {
            int sum = 0; 
            
            while (number != 0) {
                int lastDigit = number % 10; // Find the last digit
                sum = sum + lastDigit;           // Add the last digit
                number = number / 10;               // Remove the last digit from the number
            }
            
            return sum;
        }
        
        public static void main(String[] args) {
            int num = 12345; 
            System.out.println("The sum of the digits of " + num + " is " + computeSumOfDigits(num));
        }
    
}
