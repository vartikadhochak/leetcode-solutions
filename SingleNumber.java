public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int index = 0;
        for (int num : nums) {
            index = index ^ num;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 2, 1};
        System.out.println("Single number in [2, 2, 1]: " + singleNumber(nums1)); // Output: 1

        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println("Single number in [4, 1, 2, 1, 2]: " + singleNumber(nums2)); // Output: 4
    }
}