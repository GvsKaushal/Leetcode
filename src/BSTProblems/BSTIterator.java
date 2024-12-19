package BSTProblems;

import java.util.Stack;

public class BSTIterator {

    Stack<TreeNode> stack = new Stack<>();

    public BSTIterator(TreeNode root) {
        loadIntoStack(root);
    }

    public int next() {
        if (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            if (temp.right != null) {
                loadIntoStack(temp.right);
            }
            return temp.val;
        }
        return -1;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    private void loadIntoStack(TreeNode root) {
        while (root != null) {
            stack.push(root);
            root = root.left;
        }
    }
}
