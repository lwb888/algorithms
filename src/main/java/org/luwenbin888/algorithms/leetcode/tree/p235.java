package org.luwenbin888.algorithms.leetcode.tree;

public class p235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > p.val && root.val > q.val) return lowestCommonAncestor(root.left, p, q);
        else if (root.val < p.val && root.val < q.val) return lowestCommonAncestor(root.right, p, q);
        else return root;
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtils.constructTree(new Integer[]{6,2,8,0,4,7,9,null,null,3,5});
        p235 sol = new p235();
        TreeNode res = sol.lowestCommonAncestor(root, TreeUtils.search(root, 2),
                TreeUtils.search(root, 4));
        if (res != null) System.out.println(res.val);
    }
}
