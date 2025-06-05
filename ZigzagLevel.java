// ZigzagLevelOrder.java
import java.util.*;

public class ZigzagLevel{
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int v) { val = v; }
        TreeNode(int v, TreeNode l, TreeNode r) { val = v; left = l; right = r; }
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean dir = true;

        while (!q.isEmpty()) {
            int n = q.size();
            LinkedList<Integer> level = new LinkedList<>();
            for (int i = 0; i < n; ++i) {
                TreeNode cur = q.poll();
                if (dir) level.addLast(cur.val);
                else     level.addFirst(cur.val);
                if (cur.left  != null) q.offer(cur.left);
                if (cur.right != null) q.offer(cur.right);
            }
            res.add(level);
            dir = !dir;
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        System.out.println(zigzagLevelOrder(root)); // [[3], [20, 9], [15, 7]]
    }
}
