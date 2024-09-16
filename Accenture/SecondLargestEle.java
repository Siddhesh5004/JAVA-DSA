public class SecondLargestEle {
 
        public static int secondLargest(int[] arr) {
            int n = arr.length;
            if (n < 2) {
                return -1; // Not enough elements to find the second largest
            }
            
            int largestElement = Integer.MIN_VALUE;
            int secondLargestElement = Integer.MIN_VALUE;
            
            for (int i = 0; i < n; i++) {
                if (arr[i] > largestElement) {
                    secondLargestElement = largestElement; // Update second largest
                    largestElement = arr[i]; // Update largest
                } else if (arr[i] > secondLargestElement && arr[i] != largestElement) {
                    secondLargestElement = arr[i]; // Update second largest
                }
            }
            
            // If secondLargestElement was never updated, it means no second largest was found
            return secondLargestElement == Integer.MIN_VALUE ? -1 : secondLargestElement;
        }
        
        public static void main(String[] args) {
            int[] arr = {5,2,4,50,20,10,10};
            int result = secondLargest(arr);
            System.out.println("Second largest element is " + result);
        }
    }

