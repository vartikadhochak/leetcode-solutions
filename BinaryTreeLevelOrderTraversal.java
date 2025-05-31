import java.util.*;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        // Build tree: [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3,
                            new TreeNode(9),
                            new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        Solution sol = new Solution();
        List<List<Integer>> result = sol.levelOrder(root);

        System.out.println(result);  // Output: [[3],[9,20],[15,7]]
    }
}

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                currLevel.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            result.add(currLevel);
        }

        return result;
    }
}
