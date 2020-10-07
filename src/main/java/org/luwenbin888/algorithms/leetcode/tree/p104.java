package org.luwenbin888.algorithms.leetcode.tree;

public class p104 {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtils.constructTree(new Integer[]{3,9,20,null,null,15,7});
        p104 sol = new p104();
        System.out.println(sol.maxDepth(root));
    }
}
