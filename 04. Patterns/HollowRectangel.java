
public class HollowRectangel {

    public static void hollow_rectangle(int totalRows , int totalCol){

        for(int i =1 ;i<=totalRows;i++){
            for(int j =1; j<=totalCol ; j++){
                if(i ==1 || i ==totalRows || j==1 || j==totalCol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }   
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rectangle(10, 10);
      
    }
}
