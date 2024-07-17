// check if the number is even or odd 

public class Problem1 {
    public static void oddeven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("even number");

        } else {
            System.out.println("odd number");
        }
    }

    public static void main(String[] args) {
        oddeven(5);
        oddeven(10);
        oddeven(13);
    }
}
