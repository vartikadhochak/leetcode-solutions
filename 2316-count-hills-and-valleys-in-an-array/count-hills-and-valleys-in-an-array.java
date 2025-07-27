import java.util.ArrayList;
import java.util.List;

class Solution {
    public int countHillValley(int[] nums) {
        List<Integer> processed = new ArrayList<>();
        processed.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                processed.add(nums[i]);
            }
        }
        
        int count = 0;
        for (int i = 1; i < processed.size() - 1; i++) {
            int left = processed.get(i - 1);
            int current = processed.get(i);
            int right = processed.get(i + 1);
            
            if ((current > left && current > right) || (current < left && current < right)) {
                count++;
            }
        }
        return count;
    }
}