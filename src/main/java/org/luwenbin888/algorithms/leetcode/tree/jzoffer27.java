package org.luwenbin888.algorithms.leetcode.tree;

public class jzoffer27 {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;

        mirrorTree2(root);
        return root;
    }

    private void mirrorTree2(TreeNode root) {
        if (root == null) return;

        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        mirrorTree2(root.left);
        mirrorTree2(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtils.constructTree(new Integer[]{4,2,7,1,3,6,9});
        jzoffer27 sol = new jzoffer27();
        root = sol.mirrorTree(root);
        TreeUtils.preorder(root);
    }
}
