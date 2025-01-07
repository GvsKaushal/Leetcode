package BSTProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Kth_SmallestElementInA_BST {


    public int kthSmallest(TreeNode root, int k) {

        Stack<TreeNode> stack = new Stack<>();
        int count = 0;

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
                count++;
                if (count == k) {
                    return temp.val;
                }
                temp = temp.right;
            }
        }

        return count;
    }

}
