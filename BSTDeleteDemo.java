// File: BSTDeleteDemo.java

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class BSTDeleteDemo{

    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;

        if (key < root.val)
            root.left = deleteNode(root.left, key);
        else if (key > root.val)
            root.right = deleteNode(root.right, key);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            TreeNode minNode = findMin(root.right);
            root.val = minNode.val;
            root.right = deleteNode(root.right, minNode.val);
        }
        return root;
    }

    private static TreeNode findMin(TreeNode node) {
        while (node.left != null) node = node.left;
        return node;
    }

    // Utility to print inorder traversal
    public static void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    // Manual BST construction and testing
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        System.out.print("Original BST (Inorder): ");
        inorder(root);
        System.out.println();

        int key = 3;
        root = deleteNode(root, key);

        System.out.print("BST after deleting " + key + ": ");
        inorder(root);
        System.out.println();
    }
}
