package TreeProblems;

public class SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null || q == null) {
            if (p == q) {
                return true;
            }
            return false;
        }

        boolean val = p.val == q.val;
        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);

        if (val && left && right) {
            return true;
        }
        return false;

    }


}
