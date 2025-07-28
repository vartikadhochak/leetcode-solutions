import java.util.ArrayList;
import java.util.List;

class Solution {
    private int maxOr = 0;
    private int count = 0;

    public int countMaxOrSubsets(int[] nums) {
        // First, compute the maximum OR possible, which is the OR of all elements
        maxOr = 0;
        for (int num : nums) {
            maxOr |= num;
        }
        
        // Now, count all subsets whose OR equals maxOr
        count = 0;
        backtrack(nums, 0, 0);
        return count;
    }
    
    private void backtrack(int[] nums, int start, int currentOr) {
        if (currentOr == maxOr) {
            // Any remaining elements can be included or not, all will contribute to the count
            // The number of remaining subsets is 2^(remaining elements)
            count += (1 << (nums.length - start));
            return;
        }
        
        for (int i = start; i < nums.length; i++) {
            backtrack(nums, i + 1, currentOr | nums[i]);
        }
    }
}