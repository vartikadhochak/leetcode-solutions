public class GoodArray{
    public static boolean isGoodArray(int[] nums) {
        int tempGCD = nums[0];
        int i = 0;
        while (i < nums.length) {
            tempGCD = gcd(tempGCD, nums[i]);
            i++;
            if (tempGCD == 1) return true;
        }
        return false;
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, (a % b));
    }

    public static void main(String[] args) {
        int[] nums1 = {12, 5, 7, 23};
        System.out.println("Is the array good? " + isGoodArray(nums1)); // Output: true
        
        int[] nums2 = {29, 6, 10};
        System.out.println("Is the array good? " + isGoodArray(nums2)); // Output: true
    }
}