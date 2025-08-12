import java.util.*;

class Solution {
    public int numberOfWays(int n, int x) {
        int MOD = 1000000007;
        List<Integer> powers = new ArrayList<>();
        for (int i = 1; ; i++) {
            int power = (int) Math.pow(i, x);
            if (power > n) {
                break;
            }
            powers.add(power);
        }
        int m = powers.size();
        int[][] dp = new int[m + 1][n + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= m; i++) {
            int currentPower = powers.get(i - 1);
            for (int j = 0; j <= n; j++) {
                dp[i][j] = dp[i - 1][j]; // not take the i-th element
                if (j >= currentPower) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j - currentPower]) % MOD;
                }
            }
        }
        return dp[m][n];
    }
}