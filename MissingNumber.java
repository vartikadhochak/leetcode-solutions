// MissingNumber.java

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        MissingNumber solution = new MissingNumber();

        // Example array: numbers 0 to 5, missing 3 → [0, 1, 2, 4, 5]
        int[] nums = {0, 1, 2, 4, 5};

        System.out.print("Input array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        int missing = solution.missingNumber(nums);
        System.out.println("Missing number: " + missing);
    }
}
