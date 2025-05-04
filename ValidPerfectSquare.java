public class ValidPerfectSquare {
    // Method to check if a number is a perfect square
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true; // 0 and 1 are perfect squares
        
        int left = 2, right = num / 2;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;  // Using long to avoid overflow
            
            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return false;
    }

    // Main method to test the solution
    public static void main(String[] args) {
        ValidPerfectSquare solution = new ValidPerfectSquare();
        
        // Test case
        int num = 16;
        boolean result = solution.isPerfectSquare(num);
        
        System.out.println("Is " + num + " a perfect square? " + result);
    }
}
