package org.luwenbin888.algorithms.leetcode.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class jzoffer35 {
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
        // map between old node and new node
        Map<Node, Node> nodes = new HashMap<>();

        Node p = head;
        Node newhead = new Node(0), np = newhead;

        while (p != null) {
            Node newnode = new Node(p.val);
            newnode.random = p.random;
            np.next = newnode;
            np = np.next;

            nodes.put(p, newnode);
            p = p.next;
        }

        np = newhead.next;
        while (np != null) {
            Node oldp = np.random;
            if (oldp != null) {
                np.random = nodes.get(np.random);
            }
            np = np.next;
        }

        return newhead.next;
    }
}
