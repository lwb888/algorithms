package org.luwenbin888.algorithms.leetcode.tree;

public class p1022 {
    int sum = 0;
    public int sumRootToLeaf(TreeNode root) {
        sumRootToLeaf3(root, 0);

        return sum;
    }

    private void sumRootToLeaf2(TreeNode root, String path) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            path = path + root.val;
            sum += Integer.parseInt(path, 2);
            return;
        }

        if (root.left != null) sumRootToLeaf2(root.left, path + root.val);
        if (root.right != null) sumRootToLeaf2(root.right, path + root.val);
    }

    private void sumRootToLeaf3(TreeNode root, int val) {
        if (root == null) return;

        val = ((val << 1) + root.val);
        if (root.left == null && root.right == null) {
            sum += val;
        }

        if (root.left != null) sumRootToLeaf3(root.left, val);
        if (root.right != null) sumRootToLeaf3(root.right, val);
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtils.constructTree(new Integer[]{1,0,1,0,1,0,1});
        p1022 sol = new p1022();
        //int res = sol.sumRootToLeaf(root);
        int res = sol.sumRootToLeaf(root);
        System.out.println(res);
    }
}
