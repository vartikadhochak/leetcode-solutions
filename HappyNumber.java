import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }
        
        return n == 1;
    }
    
    private int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        HappyNumber solution = new HappyNumber(); // Fixed: create HappyNumber instance

        int[] testNumbers = {19, 2, 7, 20};
        for (int n : testNumbers) {
            boolean result = solution.isHappy(n); // Fixed: call instance method
            System.out.println("Is " + n + " a happy number? " + result);
        }
    }
}
