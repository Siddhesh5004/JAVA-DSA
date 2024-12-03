
// for decimal to binary we only need to multiply by remainder instead of lastDigit,
// and 10 instead of 2 in binNum variable formula && n =n/2 instead of n =n/10 

public class DecimaltoBinary { 
    public static void DeciToBin(int n) {
        int myNum = n ;
        int pow =0;
        int binNum =0;

        while(n>0){
            int rem = n%2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;

            n = n/2; 

        }
        System.out.println("binary form of " + myNum + " is " + binNum);
    }
    public static void main(String[] args) {
        DeciToBin(5);
    }
}
