
public class multiarray {
    public static void main(String[] args) {
        int [] [] arr = {{56,43},{6,34},{7,8}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) { //always write arr[i].length if not Arrayoutofbound exception 
                System.out.println(arr[i][j]);
            }
        }
    }
    
}
