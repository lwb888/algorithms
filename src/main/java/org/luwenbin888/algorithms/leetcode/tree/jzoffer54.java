package org.luwenbin888.algorithms.leetcode.tree;

public class jzoffer54 {
    int current = 0, k, size = 0;
    int res = 0;
    public int kthLargest(TreeNode root, int k) {
        if (root == null) return 0;
        treeSize(root);
        this.k = size - k + 1;

        kthLargest2(root);

        return res;
    }

    private void treeSize(TreeNode root) {
        if (root == null) return;
        size++;
        if (root.left != null) treeSize(root.left);
        if (root.right != null) treeSize(root.right);
    }

    private void kthLargest2(TreeNode root) {
        if (root == null || current >= k) return;

        kthLargest2(root.left);
        current++;
        if (current == k) {
            res = root.val;
        }
        kthLargest2(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(1);
        TreeNode node4 = new TreeNode(4);
        root.left = node1;
        root.right = node4;
        TreeNode node2 = new TreeNode(2);
        node1.right = node2;

        jzoffer54 sol = new jzoffer54();

        int res = sol.kthLargest(root, 1);
        System.out.println(res);
    }
}
