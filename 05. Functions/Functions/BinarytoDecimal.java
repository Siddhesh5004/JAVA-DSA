public class BinarytoDecimal {

    public static void BintoDeci(int binNum) {
        int pow = 0; // To track the power of 2
        int decNum = 0; // To store the decimal 
        int originalBin = binNum; 

        while (binNum > 0) {
            int lastDigit = binNum % 10; 
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow)); 
            pow++; 
            binNum = binNum / 10; 
        }

        System.out.println("Decimal of " + originalBin + " is " + decNum);
    }

    public static void main(String[] args) {
        BintoDeci(101); 
    }
}
