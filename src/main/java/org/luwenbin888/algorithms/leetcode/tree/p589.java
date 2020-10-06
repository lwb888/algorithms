package org.luwenbin888.algorithms.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class p589 {
    static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    List<Integer> res = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        preorder2(root);
        return res;
    }

    private void preorder2(Node root) {
        if (root == null) return;
        res.add(root.val);
        for (Node child: root.children) {
            preorder2(child);
        }
    }

    public static void main(String[] args) {

    }
}
