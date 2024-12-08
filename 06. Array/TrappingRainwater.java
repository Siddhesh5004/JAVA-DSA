
public class TrappingRainwater {
   public static int trappedwater(int[] arr){
            int n = arr.length;
            
            //calculate left max boundary -arr
            
            int leftMax[] = new int [n];
            leftMax[0] = arr[0];
            for(int i=1; i<n; i++){
                leftMax[i] = Math.max(arr[i] ,leftMax[i-1]);
            }
            
            //calculate right max Boundary -arr
            
            int rightMax[] = new int [n];
            rightMax[n-1] = arr[n-1];
            
            for(int i =n-2; i>=0; i--){
                rightMax[i] = Math.max(arr[i],rightMax[i+1]);
            }
            
            int trappedwater = 0;
            for(int i=0; i<n; i++){
                
                //waterlevel = min(leftMax , rightMax)
                int waterlevel = Math.min(leftMax[i],rightMax[i]);
                
                //trappedwater = waterlevel - height[i]
                trappedwater = trappedwater + (waterlevel - arr[i]);
            }
            return trappedwater;
        }

    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        System.out.println(trappedwater(arr)); 
        
        }
}
