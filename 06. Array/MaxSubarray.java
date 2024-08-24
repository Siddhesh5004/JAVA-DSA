public class MaxSubarray {
    public static void MaxSubarray(int nums[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k] + " ");
                    // Sum of subarray
                    currSum += nums[k];
                }
                System.out.println("=> Subarray Sum: " + currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int nums[] = {1,-2,6,-1,3};
        MaxSubarray(nums);
    }
}
