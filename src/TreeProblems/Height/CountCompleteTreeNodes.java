package TreeProblems.Height;

public class CountCompleteTreeNodes {

    public int countNodes(TreeNode root) {

        if (root == null) return 0;

        int left = findLeft(root);
        int right = findRight(root);

        if (left == right) return ((int) Math.pow(2, left) - 1);

        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    private int findLeft(TreeNode left) {
        int count = 0;

        while (left != null) {
            count++;
            left = left.left;
        }

        return count;
    }

    private int findRight(TreeNode right) {
        int count = 0;

        while (right != null) {
            count++;
            right = right.right;
        }

        return count;
    }


}
