package org.luwenbin888.algorithms.leetcode.tree;

public class p226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }

    public static void main(String[] args) {
        Integer[] arr = {4,2,7,1,3,6,9};
        TreeNode root = TreeUtils.constructTree(arr);
        p226 sol = new p226();
        root = sol.invertTree(root);
        TreeUtils.preorder(root);
    }
}
