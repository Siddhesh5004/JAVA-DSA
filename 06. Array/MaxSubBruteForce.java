public class MaxSubBruteForce {
    public static void MaxSubBruteForce(int nums[]) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int currSum = 0;  // Reset currSum for each new subarray
                
                for (int k = i; k <= j; k++) {
                    currSum += nums[k];
                }
                
                System.out.println("Current subarray sum from index " + i + " to " + j + " = " + currSum);
                
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int nums[] = {1, -2, 6, -1, 3};
        MaxSubBruteForce(nums);
    }
}
