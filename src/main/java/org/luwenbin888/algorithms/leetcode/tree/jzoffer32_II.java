package org.luwenbin888.algorithms.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class jzoffer32_II {
    private List<List<Integer>> res = new ArrayList<>();
    Queue<TreeNode> treeNodes = new LinkedList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return res;
        treeNodes.offer(root);

        levelOrder2(root);
        return res;
    }

    private void levelOrder2(TreeNode root) {
        while (!treeNodes.isEmpty()) {
            int levelSize = treeNodes.size();
            List<Integer> levelRes = new ArrayList<>();
            while (levelSize-- > 0) {
                TreeNode node = treeNodes.poll();
                levelRes.add(node.val);
                if (node.left != null) treeNodes.offer(node.left);
                if (node.right != null) treeNodes.offer(node.right);
            }
            res.add(levelRes);
        }
    }
}
