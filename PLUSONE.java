// PLUSONE.java

import java.util.Arrays;

public class PLUSONE {

    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from the last digit backward
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // no carry needed, return early
            }
            digits[i] = 0; // set current digit to 0, carry over to next
        }

        // If all digits were 9, we need a bigger array (like 999 + 1 = 1000)
        int[] result = new int[n + 1];
        result[0] = 1; // first digit is 1, others are 0 by default
        return result;
    }

    public static void main(String[] args) {
        PLUSONE solution = new PLUSONE();

        int[] input1 = {1, 2, 3};
        System.out.println("Input: " + Arrays.toString(input1));
        System.out.println("Output: " + Arrays.toString(solution.plusOne(input1)));

        int[] input2 = {4, 3, 2, 1};
        System.out.println("Input: " + Arrays.toString(input2));
        System.out.println("Output: " + Arrays.toString(solution.plusOne(input2)));

        int[] input3 = {9, 9, 9};
        System.out.println("Input: " + Arrays.toString(input3));
        System.out.println("Output: " + Arrays.toString(solution.plusOne(input3)));
    }
}
