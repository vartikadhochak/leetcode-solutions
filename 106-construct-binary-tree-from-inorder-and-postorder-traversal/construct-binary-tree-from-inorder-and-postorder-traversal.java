class Solution {
    private int postIndex;
    private Map<Integer, Integer> inorderMap;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;
        inorderMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return buildTreeHelper(postorder, 0, inorder.length - 1);
    }

    private TreeNode buildTreeHelper(int[] postorder, int inStart, int inEnd) {
        if (inStart > inEnd) {
            return null;
        }
        
        int rootVal = postorder[postIndex--];
        TreeNode root = new TreeNode(rootVal);
        
        int inRootIndex = inorderMap.get(rootVal);
        
        root.right = buildTreeHelper(postorder, inRootIndex + 1, inEnd);
        root.left = buildTreeHelper(postorder, inStart, inRootIndex - 1);
        
        return root;
    }
}