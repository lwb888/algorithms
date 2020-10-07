package org.luwenbin888.algorithms.leetcode.tree;

public class p965 {
    public boolean isUnivalTree(TreeNode root) {
        return traverse(root);
    }

    private boolean traverse(TreeNode root) {
        if (root == null) return true;
        if (root.left != null && root.val != root.left.val) return false;
        if (root.right != null && root.val != root.right.val) return false;

        return traverse(root.left) && traverse(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtils.constructTree(new Integer[]{1,1,1,2,1,null,1});
        p965 sol = new p965();
        System.out.println(sol.isUnivalTree(root));
    }
}
