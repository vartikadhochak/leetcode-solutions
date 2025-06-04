// File: SumRootToLeaf.java
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}

public class SumRootToLeaf{

    public static int sumNumbers(TreeNode root) {
        return dfs(root, 0);
    }

    private static int dfs(TreeNode node, int pathSum) {
        if (node == null) return 0;

        pathSum = pathSum * 10 + node.val;

        if (node.left == null && node.right == null)
            return pathSum;

        return dfs(node.left, pathSum) + dfs(node.right, pathSum);
    }

    public static void main(String[] args) {
        /*
            Tree:
                1
               / \
              2   3

            Paths:
            12 + 13 = 25
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        System.out.println(sumNumbers(root)); // Output: 25
    }
}
