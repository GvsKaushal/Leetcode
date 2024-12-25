package TreeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
// you can also use stack

public class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        rightSide(root, list, 0);

        return list;
    }

    private void rightSide(TreeNode root, List<Integer> list, int level) {

        if (root == null) return;

        if (level == list.size()) {
            list.add(root.val);
        }

        rightSide(root.right, list, level + 1);
        rightSide(root.left, list, level + 1);
    }
}
