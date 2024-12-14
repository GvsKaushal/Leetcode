package TreeProblems.Height;

public class BinaryTreeMaximumPathSum {

    public int maxPathSum(TreeNode root) {

        int[] maxPath = new int[1];
        maxPath[0] = Integer.MIN_VALUE;

        int result = heightOfBinaryTree(root, maxPath);

        return maxPath[0];
    }

    public int heightOfBinaryTree(TreeNode root, int[] maxPath) {

        if (root == null) return 0;

        // avoid Negative values ---> 0
        int LH = Math.max(0, heightOfBinaryTree(root.left, maxPath));
        int RH = Math.max(0, heightOfBinaryTree(root.right, maxPath));

        maxPath[0] = Math.max(maxPath[0], LH + RH + root.val);

        return root.val + Math.max(LH, RH);
    }
}
