package BSTProblems;

public class InsertintoaBinarySearchTree {

    public TreeNode insertIntoBST(TreeNode root, int val) {

        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        insert(root, val);

        return root;
    }

    private TreeNode insert(TreeNode root, int val) {

        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }

        return root;
    }
}
