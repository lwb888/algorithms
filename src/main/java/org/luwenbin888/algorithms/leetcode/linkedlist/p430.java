package org.luwenbin888.algorithms.leetcode.linkedlist;

public class p430 {
    static class Node {
        public int val;
        public Node prev;
        public Node next;
        public Node child;
    };

    private Node res = new Node(), p = res;



    public Node flatten(Node head) {
        if (head == null) return null;

        flatten1(head);
        p.next = null;
        res.next.prev = null;
        return res.next;
    }

    public void flatten1(Node head) {
        if (head == null) return;
        Node current = head;
        while (current != null) {
            Node next = current.next;
            current.next = null;
            p.next = current;
            current.prev = p;
            p = p.next;
            if (current.child != null) {
                Node child = current.child;
                current.child = null;
                flatten1(child);
            }
            current = next;
        }
    }

    public static void main(String[] args) {
        Node head1 = construct(new int[]{1,2,3,4,5,6});
        Node node3 = search(head1, 3);

        Node head2 = construct(new int[]{7,8,9,10});
        node3.child = head2;
        Node node8 = search(head2, 8);

        Node head3 = construct(new int[]{11,12});
        node8.child = head3;

        print(head1);
        System.out.println();

        p430 sol = new p430();
        Node head = sol.flatten(head1);
        print(head);
    }

    private static Node construct(int[] data) {
        Node head = new Node(), p = head;
        for (int d: data) {
            Node node = new Node();
            node.val = d;
            node.prev = p;
            p.next = node;
            p = p.next;
        }

        p.next = null;

        head.next.prev = null;

        return head.next;
    }

    private static Node search(Node head, int data) {
        Node p = head;
        while (p != null) {
            if (p.val == data) return p;
            p = p.next;
        }

        return null;
    }

    private static void print(Node head) {
        if (head == null) return;
        Node p = head;
        while (p != null) {
            System.out.print(p.val + "-->");
            if (p.child != null) {
                print(p.child);
            }
            p = p.next;
        }
    }
}
