package org.luwenbin888.algorithms.leetcode.stack;

public class jzoffer30 {
    class MinStack {

        private class Node {
            private int data;
            private int min;
            private Node next;
        }

        private Node head;

        /** initialize your data structure here. */
        public MinStack() {

        }

        public void push(int x) {
            Node node = new Node();
            node.data = x;

            if (head == null) {
                node.min = x;
            }
            else {
                if (x < head.min) {
                    node.min = x;
                }
                else node.min = head.min;

                node.next = head;
            }
            head = node;
        }

        public void pop() {
            Node n = head;
            head = head.next;
            n.next = null;
        }

        public int top() {
            return head.data;
        }

        public int min() {
            return head.min;
        }
    }
}
