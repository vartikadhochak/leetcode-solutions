public class townjudge{
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] trust1 = {{1, 2}};
        System.out.println("Town Judge: " + solution.findJudge(2, trust1)); // Output: 2

        int[][] trust2 = {{1, 3}, {2, 3}};
        System.out.println("Town Judge: " + solution.findJudge(3, trust2)); // Output: 3

        int[][] trust3 = {{1, 3}, {2, 3}, {3, 1}};
        System.out.println("Town Judge: " + solution.findJudge(3, trust3)); // Output: -1
    }
}

class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustScores = new int[n + 1]; // 1-based indexing

        for (int[] t : trust) {
            trustScores[t[0]]--; // person trusts someone
            trustScores[t[1]]++; // person is trusted
        }

        for (int i = 1; i <= n; i++) {
            if (trustScores[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}