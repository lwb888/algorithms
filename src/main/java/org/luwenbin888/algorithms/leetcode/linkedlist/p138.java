package org.luwenbin888.algorithms.leetcode.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class p138 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        Map<Node, Node> nodes = new HashMap<>();
        Node p = head;
        Node h1 = new Node(0), p1 = h1;
        while (p != null) {
            Node node = new Node(p.val);
            node.random = p.random;
            p1.next = node;
            p1 = p1.next;

            nodes.put(p, node);

            p = p.next;
        }

        p1 = h1.next;
        while (p1 != null) {
            p1.random = nodes.get(p1.random);
            p1 = p1.next;
        }

        return h1.next;
    }
}
