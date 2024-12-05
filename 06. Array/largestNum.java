
public class largestNum {
    
        public static void main(String[] args) {
            int[] arr = {5, -1, 15, 23, 7};
    
            int largest = Integer.MIN_VALUE; // Start with the smallest possible int
            int smallest = Integer.MAX_VALUE; // Start with the largest possible int
    
            for (int num : arr) {
                if (num > largest) {
                    largest = num; // Update largest
                }
                if (num < smallest) {
                    smallest = num; // Update smallest
                }
            }
    
            System.out.println("Largest: " + largest);   // Output: 23
            System.out.println("Smallest: " + smallest); // Output: -1
        }
    }
