
public class SearchElement { //Kind of Linear Search
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 10 }; //ans 6th index
        int ans = 0;
        int x = 10;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
