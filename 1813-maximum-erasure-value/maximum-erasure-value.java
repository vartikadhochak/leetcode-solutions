import java.util.HashSet;

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxSum = 0;
        int currentSum = 0;
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            int num = nums[right];
            while (set.contains(num)) {
                currentSum -= nums[left];
                set.remove(nums[left]);
                left++;
            }
            set.add(num);
            currentSum += num;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
}