package org.luwenbin888.algorithms.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class p637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            double levelSum = 0;
            int i = 0;
            while (i++ < levelSize) {
                TreeNode node = queue.poll();
                levelSum += node.val;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            res.add(levelSum / levelSize);
        }

        return res;
    }

    public static void main(String[] args) {
        TreeNode root = TreeUtils.constructTree(new Integer[]{2147483647,2147483647,2147483647});
        p637 sol = new p637();
        List<Double> res = sol.averageOfLevels(root);
        for (double val: res) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
