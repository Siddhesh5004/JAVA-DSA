public class BinarytoDecimal {

    public static void BintoDeci(int binNum) {
        int pow = 0; // To track the power of 2
        int decNum = 0; // To store the decimal 
        int originalBin = binNum; // To keep the original binary number for display

        while (binNum > 0) {
            int lastDigit = binNum % 10; // Extract the last digit
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow)); // Add the contribution of the digit
            pow++; // Increment the power of 2
            binNum = binNum / 10; // Remove the last digit
        }

        System.out.println("Decimal of " + originalBin + " is " + decNum);
    }

    public static void main(String[] args) {
        BintoDeci(101); // Testing with binary number 101
    }
}
