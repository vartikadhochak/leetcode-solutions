import java.util.*;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K k, V v) {
        key = k;
        value = v;
    }

    public K getKey() { return key; }

    public V getValue() { return value; }
}

public class SumOfLeftLeavesBFS {
    public static void main(String[] args) {
        /*
             3
            / \
           9  20
              /  \
             15   7
        */
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Solution solution = new Solution();
        int result = solution.sumOfLeftLeaves(root);

        System.out.println("Sum of left leaves: " + result);  // Output: 24 (9 + 15)
    }
}

class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<Pair<TreeNode, Boolean>> queue = new LinkedList<>();
        queue.offer(new Pair<>(root, false));
        int result = 0;

        while (!queue.isEmpty()) {
            Pair<TreeNode, Boolean> cur = queue.poll();
            TreeNode node = cur.getKey();
            boolean isLeft = cur.getValue();

            if (isLeft && node.left == null && node.right == null) {
                result += node.val;
                continue;
            }

            if (node.left != null) {
                queue.offer(new Pair<>(node.left, true));
            }
            if (node.right != null) {
                queue.offer(new Pair<>(node.right, false));
            }
        }

        return result;
    }
}
