package TreeProblems.Height;


public class MaximumDepthofBinaryTree {

    private static int maxDepth(TreeNode root) {

        if (root == null) return 0;

        int LeftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);

        return 1 + Math.max(LeftHeight, rightHeight);
    }

}
