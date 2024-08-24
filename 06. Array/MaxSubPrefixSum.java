public class MaxSubPrefixSum {
    public static void maxSubarraySum(int nums[]) {
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];

        prefix[0] = nums[0];
        // Calculate prefix array
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        
        // Calculate the sum of subarrays using prefix array
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                
                // Calculate the current sum using the prefix sum array
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                
                // Update maxSum if currSum is greater
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        maxSubarraySum(arr); // Pass the correct array to the function
    }
}
