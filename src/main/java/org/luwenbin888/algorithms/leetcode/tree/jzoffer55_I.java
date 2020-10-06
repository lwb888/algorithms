package org.luwenbin888.algorithms.leetcode.tree;

public class jzoffer55_I {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        Integer[] arr = {3,9,20,null,null,15,7};
        TreeNode root = TreeUtils.constructTree(arr);
        jzoffer55_I sol = new jzoffer55_I();
        int res = sol.maxDepth(root);

        System.out.println(res);
    }
}
