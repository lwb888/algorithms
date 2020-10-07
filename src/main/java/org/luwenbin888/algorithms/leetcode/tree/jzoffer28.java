package org.luwenbin888.algorithms.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class jzoffer28 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelVals = new ArrayList<>();
            boolean allNulls = true;
            while (levelSize-- > 0) {
                TreeNode node = queue.poll();
                if (node != null) levelVals.add(node.val);
                else levelVals.add(null);

                if (node == null || node.left == null) queue.offer(null);
                else {
                    queue.offer(node.left);
                    allNulls = false;
                }

                if (node == null || node.right == null) queue.offer(null);
                else {
                    queue.offer(node.right);
                    allNulls = false;
                }
            }

            if (levelVals.size() == 1) continue;
            int i = 0, j = levelVals.size() - 1;
            while (i < j) {
                if (levelVals.get(i) != levelVals.get(j)) return false;
                i++;
                j--;
            }
            if (allNulls) break;
        }

        return true;
    }

    public boolean isSymmetric2(TreeNode root) {
        if (root == null) return true;
        return isSymmetric3(root.left, root.right);
    }

    private boolean res;

    private boolean isSymmetric3(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) return true;
        if (root1 == null || root2 == null) return false;
        if (root1.val != root2.val) return false;

        return isSymmetric3(root1.left, root2.right) && isSymmetric3(root1.right, root2.left);
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtils.constructTree(new Integer[]{1,2,2,3,4,4,3});
        jzoffer28 sol = new jzoffer28();
        boolean res = sol.isSymmetric2(root);
        System.out.println(res);
    }
}
