// File: LCA.java
public class LCA{
    // Definition for a binary tree node.
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }

    // Solution class
    static class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            int lo = Math.min(p.val, q.val), hi = Math.max(p.val, q.val);
            while (root != null) {
                if (root.val < lo)      root = root.right;   // LCA must be in right subtree
                else if (root.val > hi) root = root.left;    // LCA must be in left subtree
                else                    return root;         // current node is the LCA
            }
            return null;
        }
    }

    // Demo main method
    public static void main(String[] args) {
        // Create BST: [6,2,8,0,4,7,9,null,null,3,5]
        TreeNode n0 = new TreeNode(6);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(8);
        TreeNode n3 = new TreeNode(0);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(7);
        TreeNode n6 = new TreeNode(9);
        TreeNode n7 = new TreeNode(3);
        TreeNode n8 = new TreeNode(5);

        n0.left = n1; n0.right = n2;
        n1.left = n3; n1.right = n4;
        n2.left = n5; n2.right = n6;
        n4.left = n7; n4.right = n8;

        Solution sol = new Solution();
        System.out.println("LCA of 2 and 8: " + sol.lowestCommonAncestor(n0, n1, n2).val); // Output: 6
        System.out.println("LCA of 2 and 4: " + sol.lowestCommonAncestor(n0, n1, n4).val); // Output: 2
    }
}
