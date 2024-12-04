
public class invertedRotatedpyramid {

    public static void InvertedRotatedPyramid(int rows){

        for(int i = 1 ; i<=rows ; i++){
            for(int j = 1 ; j<=rows-i;j++ ){
                System.out.print(" ");
            }
            //stars

            for(int j =1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        InvertedRotatedPyramid(5);
    }
}
