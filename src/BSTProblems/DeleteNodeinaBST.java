package BSTProblems;

public class DeleteNodeinaBST {

    public TreeNode deleteNode(TreeNode root, int key) {

        TreeNode cur = delete(root, key);

        if (cur == null) {
            return null;
        }

        return cur;
    }

    private TreeNode delete(TreeNode root, int key) {

        if (root == null) {
            return null;
        } else if (key < root.val) {
            root.left = delete(root.left, key);
        } else if (key > root.val) {
            root.right = delete(root.right, key);
        } else {

            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                int min = findMin(root.right);
                root.val = min;
                root.right = delete(root.right, min);
            }
        }

        return root;
    }

    private int findMin(TreeNode root) {
        TreeNode temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        return temp.val;
    }
}
