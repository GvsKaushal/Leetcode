package TreeProblems.Height;


public class MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {

        if (root == null) return 0;

        int LeftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        return 1 + Math.max(LeftHeight, rightHeight);
    }

}
