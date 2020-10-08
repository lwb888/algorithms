package org.luwenbin888.algorithms.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class p257 {
    List<String> res = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return res;
        traverse(root, "");

        return res;
    }

    private void traverse(TreeNode root, String path) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            path = path + root.val;
            res.add(path);
        }

        path = path + root.val + "->";
        if (root.left != null) traverse(root.left, path);
        if (root.right != null) traverse(root.right, path);
    }

    public static void main(String[] args) {

    }
}
