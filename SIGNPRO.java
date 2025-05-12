public class SIGNPRO {

    // Function to determine the sign of the product
    public static int arraySign(int[] nums) {
        int negativeCount = 0;

        for (int num : nums) {
            if (num == 0) {
                return 0; // Product is 0 if any element is 0
            }
            if (num < 0) {
                negativeCount++; // Count negatives
            }
        }

        // If negative count is even, product is positive
        return (negativeCount % 2 == 0) ? 1 : -1;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] nums1 = {-1, -2, -3, -4, 3, 2, 1};
        int[] nums2 = {1, 5, 0, 2, -3};
        int[] nums3 = {-1, 1, -1, 1, -1};

        System.out.println("Output 1: " + arraySign(nums1)); // 1
        System.out.println("Output 2: " + arraySign(nums2)); // 0
        System.out.println("Output 3: " + arraySign(nums3)); // -1
    }
}
