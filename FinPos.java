import java.util.Arrays;

public class FinPos {

    // Search Range Solution
    static class Solution {
        public int[] searchRange(int[] nums, int target) {
            int first = findIndex(nums, target, true);
            int last = findIndex(nums, target, false) - 1;

            if (first <= last && first >= 0 && last < nums.length && nums[first] == target && nums[last] == target) {
                return new int[]{first, last};
            }
            return new int[]{-1, -1};
        }

        private int findIndex(int[] nums, int target, boolean findFirst) {
            int left = 0, right = nums.length;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] > target || (findFirst && nums[mid] == target)) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            return left;
        }
    }

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        Solution sol = new Solution();
        int[] result = sol.searchRange(nums, target);
        System.out.println("First and Last Position: " + Arrays.toString(result));
    }
}
