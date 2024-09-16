// AMAZON OA QUESTION 
//given a 2xn floor and tiles of size "2x1", count the number of ways to tile the given board using 2x1 tiles 
// a tile can be either be placed horizontally or vertically 

public class Tailingprblm {
    
    public static int tailingProblem(int n ){ //2 x n (floor size)
        
        
        if (n==0 || n==1) {
            return 1;
        }
        
        //vertical choice
        int fnm1 = tailingProblem(n-1);

        //horizontal choice
        int fnm2 = tailingProblem(n-2);

        int totalWays =fnm1+fnm2;
        return totalWays;

    }

    public static void main(String[] args) {
        System.out.println(tailingProblem(4));
    }

}
