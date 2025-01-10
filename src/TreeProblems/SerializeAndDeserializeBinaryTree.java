package TreeProblems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class SerializeAndDeserializeBinaryTree {

    public static void main(String[] args) {

//        TreeNode root2 = new TreeNode(2, null, null);
//        TreeNode root4 = new TreeNode(4, null, null);
//        TreeNode root5 = new TreeNode(5, null, null);
//        TreeNode root3 = new TreeNode(3, root4, root5);
//        TreeNode root1 = new TreeNode(1, root2, root3);
        TreeNode root1 = null;

        String str = serialize(root1);
        System.out.println(str);
        TreeNode r = deserialize(str);

        preorder(r);
    }


    public static String serialize(TreeNode root) {

        if (root == null) return "";

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        StringBuilder stringBuilder = new StringBuilder();

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    stringBuilder.append(node.val + " ");
                } else {
                    stringBuilder.append("#" + " ");
                }
                if (node != null) {
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
        }
        return String.valueOf(stringBuilder);
    }


    public static TreeNode deserialize(String data) {

        if (data == "") return null;

        Queue<TreeNode> queue = new LinkedList<>();

        String[] strings = data.split(" ");
        int count = 1;

        TreeNode root = new TreeNode(Integer.parseInt(strings[0]));
        queue.add(root);


        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (!strings[count].equals("#")) {
                TreeNode temp = new TreeNode(Integer.parseInt(strings[count]));
                node.left = temp;
                queue.add(temp);
                count++;
            } else {
                node.left = null;
                count++;
            }

            if (!strings[count].equals("#")) {
                TreeNode temp = new TreeNode(Integer.parseInt(strings[count]));
                node.right = temp;
                queue.add(temp);
                count++;
            } else {
                node.right = null;
                count++;
            }
        }
        return root;
    }


    private static void preorder(TreeNode root) {

        if (root == null) return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);

    }
}
