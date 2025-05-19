public class GCD {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {2, 5, 6, 9, 10};
        int[] nums2 = {7, 5, 6, 8, 3};
        int[] nums3 = {3, 3};

        System.out.println("GCD of nums1: " + solution.findGCD(nums1)); // Output: 2
        System.out.println("GCD of nums2: " + solution.findGCD(nums2)); // Output: 1
        System.out.println("GCD of nums3: " + solution.findGCD(nums3)); // Output: 3
    }
}

class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0], max = nums[0];

        // Find the smallest and largest number in the array
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        return gcd(min, max);
    }

    // Euclidean algorithm to find GCD
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
