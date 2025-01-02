package BSTProblems;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InorderSuccessorInBST {

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {

        List<TreeNode> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        int val = p.val;

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
                list.add(temp);
                temp = temp.right;
            }
        }

        int count = 0;
        for (TreeNode i : list) {

            if (count == 1) {
                return i;
            }

            if (i.val == val) {
                count++;
            }
        }

        return null;
    }
}
