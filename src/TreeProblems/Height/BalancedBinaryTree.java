package TreeProblems.Height;

public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {

        if (checkHeight(root) == -1) {
            return false;
        }

        return true;
    }

    private int checkHeight(TreeNode root) {

        if (root == null) return 0;

        int leftHeight = checkHeight(root.left);
        if (leftHeight == -1) return -1;

        int rightHeight = checkHeight(root.right);
        if (rightHeight == -1) return -1;


        int diff = leftHeight - rightHeight;
        if (Math.abs(diff) > 1) {
            return -1;
        }

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
