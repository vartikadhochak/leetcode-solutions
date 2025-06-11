// File: KthSmallestDemo.java
import java.util.*;

class TreeNode {
    int val; TreeNode left, right;
    TreeNode(int v) { val = v; }
}

public class KthSmallestDemo{

    // -------- solution logic -----------
    private static int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stk = new ArrayDeque<>();
        TreeNode cur = root;
        while (cur != null || !stk.isEmpty()) {
            while (cur != null) { stk.push(cur); cur = cur.left; }
            cur = stk.pop();
            if (--k == 0) return cur.val;
            cur = cur.right;
        }
        throw new IllegalArgumentException();
    }
    // -------- quick tree builder for demo -----------
    private static TreeNode bst(Integer... a) {           // level-order helper
        if (a.length == 0 || a[0] == null) return null;
        TreeNode root = new TreeNode(a[0]);
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root); int i = 1;
        while (!q.isEmpty() && i < a.length) {
            TreeNode n = q.poll();
            if (a[i] != null) { n.left = new TreeNode(a[i]); q.add(n.left); }
            i++;
            if (i < a.length && a[i] != null) { n.right = new TreeNode(a[i]); q.add(n.right); }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root1 = bst(3,1,4,null,2);              // Example 1
        System.out.println(kthSmallest(root1, 1));        // → 1
        TreeNode root2 = bst(5,3,6,2,4,null,null,1);      // Example 2
        System.out.println(kthSmallest(root2, 3));        // → 3
    }
}
