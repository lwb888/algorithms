package org.luwenbin888.algorithms.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeUtils {
    public static TreeNode constructTree(Integer[] arr) {
        if (arr == null || arr.length == 0) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(arr[0]);
        queue.offer(root);
        int i = 0;
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            i++;
            if (i == arr.length) break;
            if (arr[i] != null) {
                TreeNode left = new TreeNode(arr[i]);
                current.left = left;
                queue.offer(left);
            }
            else {
                current.left = null;
            }
            i++;
            if (i == arr.length) break;
            if (arr[i] != null) {
                TreeNode right = new TreeNode(arr[i]);
                current.right = right;
                queue.offer(right);
            }
            else {
                current.right = null;
            }
        }

        return root;
    }

    public static void preorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    public static void postorder(TreeNode root) {
        if (root == null) return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {
        Integer[] arr = {5,4,8, 11, null, 13, 4, 7, 2, null, null, null, 1};
        TreeNode root = TreeUtils.constructTree(arr);
        System.out.println("preorder:");
        TreeUtils.preorder(root);
        System.out.println();
        System.out.println("inorder:");
        TreeUtils.inorder(root);
        System.out.println();
        System.out.println("postorder:");
        TreeUtils.postorder(root);
        System.out.println();
    }
}
