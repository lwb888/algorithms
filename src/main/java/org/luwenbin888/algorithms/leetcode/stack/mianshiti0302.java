package org.luwenbin888.algorithms.leetcode.stack;

import java.util.Stack;

public class mianshiti0302 {
    static class MinStack {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        /** initialize your data structure here. */
        public MinStack() {

        }

        public void push(int x) {
            stack1.push(x);
            if (stack2.isEmpty()) stack2.push(x);
            else if (x < stack2.peek()) stack2.push(x);
            else stack2.push(stack2.peek());
        }

        public void pop() {
            if (!stack1.isEmpty()) {
                stack1.pop();
                stack2.pop();
            }
        }

        public int top() {
            return stack1.peek();
        }

        public int getMin() {
            return stack2.peek();
        }
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.top();
        System.out.println(minStack.getMin());
    }
}
