package TreeProblems;

import java.util.LinkedList;
import java.util.Queue;

public class Maximum_Width_of_BinaryTree {

    class pair {
        TreeNode node;
        long index;

        pair(TreeNode node, long index) {
            this.node = node;
            this.index = index;
        }
    }

    private int widthOfBinaryTree(TreeNode root) {

        if (root == null) return 0;

        int max_width = 0;

        Queue<pair> queue = new LinkedList<>();
        queue.add(new pair(root, 0));

        while (!queue.isEmpty()) {
            int size = queue.size();

            long start_index = queue.peek().index;
            long end_index = 0;


            for (int i = 0; i < size; i++) {

                pair extract_pair = queue.poll();

                TreeNode curr_node = extract_pair.node;
                long curr_index = extract_pair.index;

                end_index = curr_index;

                if (curr_node.left != null) {
                    queue.add(new pair(curr_node.left, 2 * curr_index));
                }
                if (curr_node.right != null) {
                    queue.add(new pair(curr_node.right, 2 * curr_index + 1));
                }
            }

            int width = (int) (end_index - start_index + 1);
            max_width = Math.max(max_width, width);
        }

        return max_width;
    }
}
