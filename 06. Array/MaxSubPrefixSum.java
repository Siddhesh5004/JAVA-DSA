/**
 * MaxSubPrefixSum
 */
public class MaxSubPrefixSum {
    public static void maxSubarraySum(int nums[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];

        prefix[0] = nums[0];
        // Calculate prefix array
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        // This nested loop is inefficient. We can optimize this using Kadane's algorithm.
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                currSum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        maxSubarraySum(arr); // Pass the correct array to the function
    }
}
