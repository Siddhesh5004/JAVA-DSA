

public class Maxvalue {
    public static void main(String[] args) {
        int [] arr = {8,1,2,3,4,5,6,7};
        int ans=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>ans) {
                ans=arr[i];
            }

        }
        System.out.println("Max value " + ans);
    }
    
}
