public class SubarrayLCM {
    public static void main(String[] args) {
        int[] nums = {3, 6, 2, 7, 1};
        int k = 6;

        SubarrayLCM solution = new SubarrayLCM();
        System.out.println("Subarrays with LCM " + k + ": " + solution.subarrayLCM(nums, k)); // Output: 4
    }

    public int subarrayLCM(int[] nums, int k) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int lcmVal = nums[i];
            if (lcmVal == k) count++;

            for (int j = i + 1; j < n; j++) {
                lcmVal = lcm(lcmVal, nums[j]);
                if (lcmVal > k) break;
                if (lcmVal == k) count++;
            }
        }

        return count;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }

    private int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }
}
