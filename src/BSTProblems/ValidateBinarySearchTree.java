package BSTProblems;

public class ValidateBinarySearchTree {


    public boolean isValidBST(TreeNode root) {

        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean isValid(TreeNode root, long min_value, long Max_value) {

        if (root == null) return true;

        if (root.val <= min_value || root.val >= Max_value) return false;

        boolean left = isValid(root.left, min_value, root.val);
        boolean right = isValid(root.right, root.val, Max_value);

        return left && right;
    }
}
