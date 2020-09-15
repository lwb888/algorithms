package org.luwenbin888.algorithms.leetcode.stack;

import java.util.LinkedList;
import java.util.Queue;

public class p225 {
    static class MyStack {
        private Queue<Integer> queue = new LinkedList<>();
        int top;

        /** Initialize your data structure here. */
        public MyStack() {

        }

        /** Push element x onto stack. */
        public void push(int x) {
            queue.add(x);
            top = x;
        }

        /** Removes the element on top of the stack and returns that element. */
        public int pop() {
            int queue_size = queue.size();
            while (queue_size-- > 1) {
                int elem = queue.poll();
                top = elem;
                queue.add(elem);
            }

            return queue.poll();
        }

        /** Get the top element. */
        public int top() {
            return top;
        }

        /** Returns whether the stack is empty. */
        public boolean empty() {
            return queue.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);

        System.out.println(stack.top());
        System.out.println(stack.pop());

        System.out.println(stack.empty());
    }
}
