public class Problem3 {

    public static void reverseString(char[] s) {
        int a = 0; // start of the array (0)
        int b = s.length - 1; // end of the array

        while (a < b) {
            s[a] = (char) (s[a] ^ s[b]);
            s[b] = (char) (s[b] ^ s[a]);
            s[a] = (char) (s[a] ^ s[b]);
            a++;
            b--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(s);
    }
}
