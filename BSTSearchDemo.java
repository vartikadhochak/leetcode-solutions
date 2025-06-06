public class BSTSearchDemo{

    // Minimal TreeNode definition for a quick demo
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
        TreeNode(int v, TreeNode l, TreeNode r) { val = v; left = l; right = r; }
    }

    private static TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) return root;
        return val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4,
                         new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                         new TreeNode(7));

        TreeNode node = searchBST(root, 2);
        System.out.println(node != null ? node.val : "null");   // prints 2
    }
}
