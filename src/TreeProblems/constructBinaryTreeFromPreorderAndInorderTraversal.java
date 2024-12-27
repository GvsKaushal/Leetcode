package TreeProblems;

import java.util.HashMap;

public class constructBinaryTreeFromPreorderAndInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            hashMap.put(inorder[i], i);
        }

        return constructBinaryTree(inorder, 0, inorder.length - 1, preorder, 0, preorder.length - 1, hashMap);

    }

    private TreeNode constructBinaryTree(int[] inorder, int inStart, int inEnd,
                                         int[] preorder, int preStart, int preEnd,
                                         HashMap<Integer, Integer> hashMap) {

        if (inStart > inEnd || preStart > preEnd) return null;

        TreeNode root = new TreeNode(preorder[preStart]);

        int mid = hashMap.get(preorder[preStart]);

        int leftElements = mid - inStart;

        root.left = constructBinaryTree(inorder, inStart, mid - 1, preorder, preStart + 1, preStart + leftElements, hashMap);

        root.right = constructBinaryTree(inorder, mid + 1, inEnd, preorder, preStart + leftElements + 1, preEnd, hashMap);

        return root;
    }

}
