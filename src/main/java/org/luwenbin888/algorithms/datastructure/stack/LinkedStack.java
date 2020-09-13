package org.luwenbin888.algorithms.datastructure.stack;

public class LinkedStack implements Stack {
    private static class StackNode {
        private int val;
        private StackNode next;
    }

    private StackNode head;

    @Override
    public boolean push(int d) {
        StackNode stackNode = new StackNode();
        stackNode.val = d;
        stackNode.next = head;
        head = stackNode;

        return true;
    }

    @Override
    public Integer pop() {
        if (isEmpty()) return null;

        int val = head.val;
        head = head.next;

        return val;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public Integer peek() {
        if (isEmpty()) return null;

        return head.val;
    }
}
