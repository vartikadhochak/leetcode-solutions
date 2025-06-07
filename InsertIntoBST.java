
import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int v) { val = v; }
}

public class InsertIntoBST{
    // ---- core logic ----
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.val) root.left  = insertIntoBST(root.left,  val);
        else                root.right = insertIntoBST(root.right, val);
        return root;
    }

    // utility: in-order traversal to show sorted result
    private static void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }

    // ---- demo driver ----
    public static void main(String[] args) {
        // Build initial BST: [4,2,7,1,3]
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        // Insert value 5
        root = insertIntoBST(root, 5);

        System.out.print("In-order after insertion: ");
        inorder(root);   // Expected sorted output: 1 2 3 4 5 7
        System.out.println();
    }
}
