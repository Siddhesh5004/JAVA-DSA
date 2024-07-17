//Convert uppercase characters to lowercase using bits.

public class Problem4 {
    public static void main(String[] args) {
        // convert uppercase to lowercase

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println((char) (ch | ' '));
        }
    }
}
