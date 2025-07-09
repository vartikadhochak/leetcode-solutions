import java.util.HashMap;
import java.util.Map;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int preIndex = 0;
    private Map<Integer, Integer> inorderMap = new HashMap<>();
//VARTIKA
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return buildTreeHelper(preorder, 0, inorder.length - 1);
    }

    private TreeNode buildTreeHelper(int[] preorder, int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }
        int rootVal = preorder[preIndex++];
        TreeNode root = new TreeNode(rootVal);
        int inIndex = inorderMap.get(rootVal);
        root.left = buildTreeHelper(preorder, inStart, inIndex - 1);
        root.right = buildTreeHelper(preorder, inIndex + 1, inEnd);
        return root;
    }
}