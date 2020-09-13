package org.luwenbin888.algorithms.datastructure.stack;

public class Main {
    public static void main(String[] args) {
        final int STACK_SIZE = 10;
        Stack stack = new LinkedStack();
        for (int i = 0; i < STACK_SIZE; i++) {
            stack.push(i);
        }

        System.out.println("Stack is empty? " + stack.isEmpty());
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
