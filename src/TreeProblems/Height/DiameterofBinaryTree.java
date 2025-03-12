package TreeProblems.Height;


public class DiameterofBinaryTree {

    // height of tree

    public int diameterOfBinaryTree(TreeNode root) {

        int[] Diameter = new int[1];

        int result = heightOfBinaryTree(root, Diameter);

        return Diameter[0];
    }

    private int heightOfBinaryTree(TreeNode root, int[] diameter) {

        if (root == null) return 0;

        int LH = heightOfBinaryTree(root.left, diameter);
        int RH = heightOfBinaryTree(root.right, diameter);

        diameter[0] = Math.max(diameter[0], LH + RH);

        return 1 + Math.max(LH, RH);
    }
}
