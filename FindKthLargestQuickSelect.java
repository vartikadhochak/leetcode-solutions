
public class FindKthLargestQuickSelect {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        Solution solution = new Solution();
        int result = solution.findKthLargest(nums, k);

        System.out.println("The " + k + "th largest element is: " + result);
    }
}

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int targetIdx = nums.length - k;
        return quickSelect(nums, 0, nums.length - 1, targetIdx);
    }

    private int quickSelect(int[] nums, int left, int right, int targetIdx) {
        if (left == right) {
            return nums[left];
        }

        int pivot = nums[left];
        int low = left;
        int high = right;

        while (low <= high) {
            while (low <= high && nums[low] < pivot) {
                low++;
            }
            while (low <= high && nums[high] > pivot) {
                high--;
            }
            if (low <= high) {
                int temp = nums[low];
                nums[low] = nums[high];
                nums[high] = temp;
                low++;
                high--;
            }
        }

        if (targetIdx <= high) {
            return quickSelect(nums, left, high, targetIdx);
        } else if (targetIdx >= low) {
            return quickSelect(nums, low, right, targetIdx);
        } else {
            return nums[targetIdx];
        }
    }
}
