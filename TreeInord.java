import java.util.ArrayList;
import java.util.List;

public class TreeInord {

    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // Inorder Traversal Solution
    static class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            inorder(root, res);
            return res;
        }

        private void inorder(TreeNode node, List<Integer> res) {
            if (node == null) return;
            inorder(node.left, res);
            res.add(node.val);
            inorder(node.right, res);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        Solution sol = new Solution();
        List<Integer> result = sol.inorderTraversal(root);
        System.out.println("Inorder Traversal: " + result);
    }
}
