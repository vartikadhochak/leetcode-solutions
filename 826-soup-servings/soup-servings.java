import java.util.HashMap;
import java.util.Map;

class Solution {
    private Map<String, Double> memo;

    public double soupServings(int n) {
        if (n >= 4800) {
            return 1.0;
        }
        memo = new HashMap<>();
        return helper(n, n);
    }

    private double helper(int a, int b) {
        if (a <= 0 && b <= 0) {
            return 0.5;
        }
        if (a <= 0) {
            return 1.0;
        }
        if (b <= 0) {
            return 0.0;
        }
        String key = a + "," + b;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        double prob = 0.0;
        prob += 0.25 * helper(a - 100, b);
        prob += 0.25 * helper(a - 75, b - 25);
        prob += 0.25 * helper(a - 50, b - 50);
        prob += 0.25 * helper(a - 25, b - 75);
        memo.put(key, prob);
        return prob;
    }
}