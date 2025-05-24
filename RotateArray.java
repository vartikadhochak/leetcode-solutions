import java.util.Arrays;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);   // Step 1
        reverse(nums, 0, k - 1);             // Step 2
        reverse(nums, k, nums.length - 1);   // Step 3
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left++] = nums[right];
            nums[right--] = temp;
        }
    }

    // ✅ Main method to test rotate array
    public static void main(String[] args) {
        RotateArray ra = new RotateArray();

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        ra.rotate(nums1, k1);
        System.out.println("Rotated Array 1: " + Arrays.toString(nums1)); // [5,6,7,1,2,3,4]

        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        ra.rotate(nums2, k2);
        System.out.println("Rotated Array 2: " + Arrays.toString(nums2)); // [3,99,-1,-100]
    }
}
