import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] productQueries(int n, int[][] queries) {
        final int MOD = 1_000_000_007;
        List<Integer> powers = new ArrayList<>();
        // Generate the powers of 2 that sum up to n (LSB first)
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                powers.add(1 << i);
            }
        }
        int m = powers.size();
        int[] prefix = new int[m + 1];
        prefix[0] = 1;
        for (int i = 0; i < m; i++) {
            prefix[i + 1] = (int)(((long)prefix[i] * powers.get(i)) % MOD);
        }
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            // The product is prefix[right + 1] / prefix[left] mod MOD
            // Since MOD is prime, we can use Fermat's little theorem for division
            long product = (long)prefix[right + 1] * modInverse(prefix[left], MOD) % MOD;
            res[i] = (int)product;
        }
        return res;
    }
    
    private int modInverse(int a, int mod) {
        return pow(a, mod - 2, mod);
    }
    
    private int pow(int a, int b, int mod) {
        long res = 1;
        long x = a % mod;
        while (b > 0) {
            if (b % 2 == 1) {
                res = (res * x) % mod;
            }
            x = (x * x) % mod;
            b /= 2;
        }
        return (int)res;
    }
}