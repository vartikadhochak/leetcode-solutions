public class SeaIns {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        SeaIns si = new SeaIns();
        int[] nums = {1, 3, 5, 6};
        int target = 5; // sample target
        System.out.println("Insert position of " + target + " is: " + si.searchInsert(nums, target));
    }
}
