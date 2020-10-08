package org.luwenbin888.algorithms.leetcode.tree;

public class mianshiti1712 {

    TreeNode newRoot = null;
    TreeNode current = null;
    public TreeNode convertBiNode(TreeNode root) {
        if (root == null) return null;

        inorder(root);

        return newRoot;
    }

    private void inorder(TreeNode root) {
        if (root == null) return;
        TreeNode left = root.left, right = root.right;
        inorder(left);

        if (newRoot == null) newRoot = current = root;
        else {
            root.left = root.right = null;
            current.right = root;
            current = root;
        }

        inorder(right);
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtils.constructTree(new Integer[]{4,2,5,1,3,null,6,0});
        mianshiti1712 sol = new mianshiti1712();
        root = sol.convertBiNode(root);
        TreeUtils.preorder(root);
    }
}
