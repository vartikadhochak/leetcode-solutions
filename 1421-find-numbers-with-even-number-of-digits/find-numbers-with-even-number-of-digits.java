class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (hasEvenDigits(num)) {
                count++;
            }
        }
        return count;
    }
    
    private boolean hasEvenDigits(int num) {
        int digitCount = 0;
        if (num == 0) {
            digitCount = 1; // handle the case where num is 0
        } else {
            while (num != 0) {
                num /= 10;
                digitCount++;
            }
        }
        return digitCount % 2 == 0;
    }
}