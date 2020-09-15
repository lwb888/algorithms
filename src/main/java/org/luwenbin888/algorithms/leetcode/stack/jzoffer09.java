package org.luwenbin888.algorithms.leetcode.stack;

import java.util.Stack;

public class jzoffer09 {
    static class CQueue {
        private Stack<Integer> stack1 = new Stack<>();
        private Stack<Integer> stack2 = new Stack<>();

        public CQueue() {

        }

        public void appendTail(int value) {
            stack1.push(value);
        }

        public int deleteHead() {
            if (stack1.isEmpty()) return -1;

            while (!stack1.isEmpty()) stack2.push(stack1.pop());

            int res = stack2.pop();

            while (!stack2.isEmpty()) stack1.push(stack2.pop());

            return res;
        }
    }

    public static void main(String[] args) {
        CQueue obj = new CQueue();
        obj.appendTail(1);
        obj.appendTail(2);
        obj.appendTail(3);

        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
        System.out.println(obj.deleteHead());
    }
}
