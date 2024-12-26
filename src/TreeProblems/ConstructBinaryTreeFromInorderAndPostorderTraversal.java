package TreeProblems;

import java.util.HashMap;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            hashMap.put(inorder[i], i);
        }

        return constructBinaryTree(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, hashMap);
    }

    private TreeNode constructBinaryTree(int[] inorder, int inStart, int inEnd,
                                         int[] postorder, int postStart, int postEnd,
                                         HashMap<Integer, Integer> hashMap) {

        if (inStart > inEnd || postStart > postEnd) return null;

        TreeNode root = new TreeNode(postorder[postEnd]);

        int mid = hashMap.get(postorder[postEnd]);

        int leftElements = mid - inStart;

        root.left = constructBinaryTree(inorder, inStart, mid - 1, postorder, postStart, postStart + leftElements - 1, hashMap);

        root.right = constructBinaryTree(inorder, mid + 1, inEnd, postorder, postStart + leftElements, postEnd - 1, hashMap);

        return root;
    }
}
