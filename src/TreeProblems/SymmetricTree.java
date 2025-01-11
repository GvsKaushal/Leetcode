package TreeProblems;

public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {

        boolean result = isSameTree(root.left, root.right);

        return result;
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null || q == null) {
            if (p == q) {
                return true;
            }
            return false;
        }

        boolean val = p.val == q.val;
        boolean left = isSameTree(p.left, q.right);
        boolean right = isSameTree(p.right, q.left);

        if (val && left && right) {
            return true;
        }
        return false;

    }
}
