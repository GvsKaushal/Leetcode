package TreeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BoundaryOfBinaryTree {

    public List<Integer> boundaryOfBinaryTree(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        if (root == null) return list;

        if (root.left == null && root.right == null) {
            list.add(root.val);
            return list;
        }

        list.add(root.val);

        leftBoundary(root, list);
        leaves(root, list);
        rightBoundary(root, list);

        return list;
    }

    private void leftBoundary(TreeNode root, List<Integer> list) {

        TreeNode current = root.left;

        while (current != null) {

            if (current.left != null || current.right != null) {
                list.add(current.val);
            }

            if (current.left != null) {
                current = current.left;
            } else {
                current = current.right;
            }

        }
    }

    // mod in-order traversal
    private void leaves(TreeNode root, List<Integer> list) {

        Stack<TreeNode> stack = new Stack<>();

        TreeNode temp = root;

        while (true) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                if (stack.isEmpty()) {
                    break;
                }
                temp = stack.pop();
                if (temp.left == null && temp.right == null) {
                    list.add(temp.val);
                }
                temp = temp.right;
            }
        }

    }

    private void rightBoundary(TreeNode root, List<Integer> list) {

        Stack<Integer> stack = new Stack<>();

        TreeNode current = root.right;

        while (current != null) {

            if (current.left != null || current.right != null) {
                stack.push(current.val);
            }

            if (current.right != null) {
                current = current.right;
            } else {
                current = current.left;
            }

        }

        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
    }

}
