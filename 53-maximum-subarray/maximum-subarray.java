class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize variables
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        
        // Traverse the array
        for (int num : nums) {
            // Update currentSum to either the current element or the currentSum + current element
            currentSum = Math.max(num, currentSum + num);
            
            // Update maxSum with the maximum value between maxSum and currentSum
            maxSum = Math.max(maxSum, currentSum);
        }
        
        // Return the maximum sum found
        return maxSum;
    }
}
