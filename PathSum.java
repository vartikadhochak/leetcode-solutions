// File: PathSum.java

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

public class PathSum {

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

        int remainingSum = targetSum - root.val;
        return hasPathSum(root.left, remainingSum) || hasPathSum(root.right, remainingSum);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5,
            new TreeNode(4,
                new TreeNode(11,
                    new TreeNode(7), new TreeNode(2)
                ),
                null
            ),
            new TreeNode(8,
                new TreeNode(13),
                new TreeNode(4, null, new TreeNode(1))
            )
        );

        int targetSum = 22;
        System.out.println("Has path sum: " + hasPathSum(root, targetSum));  // Output: true
    }
}
