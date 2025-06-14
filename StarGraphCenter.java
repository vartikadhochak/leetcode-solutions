public class StarGraphCenter{
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example 1
        int[][] edges1 = {{1, 2}, {2, 3}, {4, 2}};
        System.out.println(solution.findCenter(edges1)); // Output: 2
        
        // Example 2
        int[][] edges2 = {{1, 2}, {5, 1}, {1, 3}, {1, 4}};
        System.out.println(solution.findCenter(edges2)); // Output: 1
    }
}

class Solution {
    public int findCenter(int[][] edges) {
        int a = edges[0][0];
        int b = edges[0][1];
        
        if (a == edges[1][0] || a == edges[1][1]) {
            return a;
        } else {
            return b;
        }
    }
}