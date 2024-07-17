/*Write a function that takes the binary representation of a positive integer and returns the number of set bits
it has (also known as the Hamming weight). */

public class Problem5 {
    public int hammingWeight(int n) {
        int cnt = 0;
        while (n != 0) {
            cnt += n & 1;
            n >>= 1;
        }
        return cnt;

    }
}
