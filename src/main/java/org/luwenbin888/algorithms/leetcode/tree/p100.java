package org.luwenbin888.algorithms.leetcode.tree;

public class p100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null && q != null) return false;
        if (p != null && q == null) return false;
        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode root1 = TreeUtils.constructTree(new Integer[]{1,2});
        TreeNode root2 = TreeUtils.constructTree(new Integer[]{1,null,2});

        p100 sol = new p100();
        boolean res = sol.isSameTree(root1, root2);
        System.out.println(res);
    }
}
