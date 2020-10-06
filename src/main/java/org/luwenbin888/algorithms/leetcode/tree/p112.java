package org.luwenbin888.algorithms.leetcode.tree;

public class p112 {

    boolean exists = false;
    int sum;

    public boolean hasPathSum(TreeNode root, int sum) {
        this.sum = sum;
        hasPathSum2(root, 0);

        return exists;
    }

    private void hasPathSum2(TreeNode root, int current) {
        if (root == null || exists) return;

        current += root.val;
        if (root.left == null && root.right == null) {
            if (current == this.sum) exists = true;
            return;
        }
        if (root.left != null) hasPathSum2(root.left, current);
        if (root.right != null) hasPathSum2(root.right, current);
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtils.constructTree(new Integer[]{5,4,8,11,null,13,4,7,2,null,null,null,1});
        p112 sol = new p112();
        boolean res = sol.hasPathSum(root, 22);
        System.out.println(res);
    }
}
