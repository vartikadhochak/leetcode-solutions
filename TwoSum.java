import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); // value -> index
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {}; // no solution found (should not happen)
    }

    public static void main(String[] args) {
        TwoSum solver = new TwoSum();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.println(Arrays.toString(solver.twoSum(nums1, target1))); // [0,1]

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.println(Arrays.toString(solver.twoSum(nums2, target2))); // [1,2]

        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.println(Arrays.toString(solver.twoSum(nums3, target3))); // [0,1]
    }
}
