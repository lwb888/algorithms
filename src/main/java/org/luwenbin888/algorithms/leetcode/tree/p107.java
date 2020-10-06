package org.luwenbin888.algorithms.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class p107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if (root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> levelValues = new ArrayList<>();
            while (levelSize-- > 0) {
                TreeNode node = queue.poll();
                levelValues.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            res.add(0, levelValues);
        }

        return res;
    }

    public static void main(String[] args) {
        Integer[] arr = {3,9,20,null,null,15,7};
        TreeNode root = TreeUtils.constructTree(arr);
        p107 sol = new p107();
        List<List<Integer>> res = sol.levelOrderBottom(root);
        for (List<Integer> levelVals: res) {
            for (int val: levelVals) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
