package org.luwenbin888.algorithms.leetcode.tree;

public class jzoffer68_I {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (root == p || root == q) return root;

        TreeNode minNode = p.val < q.val ? p: q;
        TreeNode maxNode = p.val < q.val ? q: p;
        if (root.val > minNode.val && root.val < maxNode.val) return root;

        if (root.val > maxNode.val) return lowestCommonAncestor(root.left, p, q);
        if (root.val < minNode.val) return lowestCommonAncestor(root.right, p, q);

        return null;
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtils.constructTree(new Integer[]{6,2,8,0,4,7,9,null,null,3,5});
        jzoffer68_I sol = new jzoffer68_I();
        TreeNode p = TreeUtils.search(root, 2);
        TreeNode q = TreeUtils.search(root, 4);
        TreeNode res = sol.lowestCommonAncestor(root, p, q);
        if (res != null) System.out.println(res.val);
    }
}
