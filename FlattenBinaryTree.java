// File: FlattenBinaryTree.java
public class FlattenBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static class Solution {
        private TreeNode prev = null;

        public void flatten(TreeNode root) {
            if (root == null) return;

            flatten(root.right);
            flatten(root.left);

            root.right = prev;
            root.left = null;
            prev = root;
        }
    }

    // Helper method to print the flattened tree
    public static void printList(TreeNode root) {
        while (root != null) {
            System.out.print(root.val + " -> ");
            root = root.right;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);

        Solution sol = new Solution();
        sol.flatten(root);
        printList(root);  // Output: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
    }
}
