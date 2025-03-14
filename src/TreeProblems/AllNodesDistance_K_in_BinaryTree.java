package TreeProblems;

import java.util.*;

public class AllNodesDistance_K_in_BinaryTree {

    public static void main(String[] args) {
        // Example tree: [3,5,1,6,2,0,8,null,null,7,4], target=5, k=2
        // Build the example tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        List<Integer> result = distanceK(root, root.left, 2);
        System.out.println(result); // Expected output: [7,4,1]
    }

    private static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        List<Integer> result = new ArrayList<>();

        if (root == null) return result;

        HashMap<TreeNode, TreeNode> hashMap = new HashMap<>();
        addParents(root, null, hashMap);

        Queue<TreeNode> queue = new LinkedList<>();
        HashSet<TreeNode> visited = new HashSet<>();

        int distance = 0;
        queue.add(target);
        visited.add(target);

        while (!queue.isEmpty()) {

            if (distance == k) {
                while (!queue.isEmpty()) {
                    result.add(queue.remove().val);
                }
                return result;
            }


            int size = queue.size();

            for (int i = 0; i < size; i++) {

                TreeNode temp = queue.remove();

                if (temp.left != null && !visited.contains(temp.left)) {
                    queue.add(temp.left);
                    visited.add(temp.left);
                }

                if (temp.right != null && !visited.contains(temp.right)) {
                    queue.add(temp.right);
                    visited.add(temp.right);
                }

                TreeNode parent_node = hashMap.get(temp);
                if (parent_node != null && !visited.contains(parent_node)) {
                    queue.add(parent_node);
                    visited.add(parent_node);
                }
            }
            distance++;
        }

        return result;

    }

    private static void addParents(TreeNode node, TreeNode parent, HashMap<TreeNode, TreeNode> hashMap) {

        if (node == null) return;

        hashMap.put(node, parent);
        addParents(node.left, node, hashMap);
        addParents(node.right, node, hashMap);
    }
}
