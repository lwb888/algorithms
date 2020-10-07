package org.luwenbin888.algorithms.leetcode.tree;

public class p404 {
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        traverse(root, false);

        return sum;
    }

    private void traverse(TreeNode root, boolean fromLeft) {
        if (root == null) return;
        if (fromLeft && root.left == null && root.right == null) sum += root.val;
        traverse(root.left, true);
        traverse(root.right, false);
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtils.constructTree(new Integer[]{1,2,3,4,5});
        p404 sol = new p404();
        System.out.println(sol.sumOfLeftLeaves(root));
    }
}
