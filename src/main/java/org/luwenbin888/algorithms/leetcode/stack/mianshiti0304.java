package org.luwenbin888.algorithms.leetcode.stack;

import java.util.Stack;

public class mianshiti0304 {
    static class MyQueue {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        /** Initialize your data structure here. */
        public MyQueue() {

        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            stack1.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }

            int res = stack2.pop();

            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }

            return res;
        }

        /** Get the front element. */
        public int peek() {
            return stack1.elementAt(0);
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return stack1.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.empty());
    }
}
