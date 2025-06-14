public class PrimeSetBits{
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example 1
        int left1 = 6, right1 = 10;
        System.out.println(solution.countPrimeSetBits(left1, right1)); // Output: 4
        
        // Example 2
        int left2 = 10, right2 = 15;
        System.out.println(solution.countPrimeSetBits(left2, right2)); // Output: 5
    }
}

class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            int setBits = Integer.bitCount(i);
            if (isPrime(setBits)) {
                count++;
            }
        }
        return count;
    }
    
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}