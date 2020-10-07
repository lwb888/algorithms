package org.luwenbin888.algorithms.leetcode.tree;

public class p101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return isSymmetric2(root.left, root.right);
    }

    private boolean isSymmetric2(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val != root2.val) return false;

        return isSymmetric2(root1.left, root2.right) && isSymmetric2(root1.right, root2.left);
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtils.constructTree(new Integer[]{1,2,2,null,3,null,3});
        p101 sol = new p101();
        System.out.println(sol.isSymmetric(root));
    }
}
