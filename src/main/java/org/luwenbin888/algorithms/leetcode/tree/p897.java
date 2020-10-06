package org.luwenbin888.algorithms.leetcode.tree;

public class p897 {
    TreeNode res = null, p = null;
    public TreeNode increasingBST(TreeNode root) {
        if (root == null) return res;
        increasingBST2(root);

        return res;
    }

    private void increasingBST2(TreeNode root) {
        if (root == null) return;

        TreeNode left = root.left, right = root.right;

        increasingBST2(left);
        root.left = root.right = null;
        if (res == null) {
            res = p = root;
        }
        else {
            p.right = root;
            p = p.right;
        }
        increasingBST2(right);
    }
}
