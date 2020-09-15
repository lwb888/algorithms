package org.luwenbin888.algorithms.leetcode.stack;

import java.util.Stack;

public class p1544 {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (stack.isEmpty()) stack.push(c);
            else {
                char p = stack.peek();
                if (Character.toLowerCase(c) == Character.toLowerCase(p) && c != p) stack.pop();
                else stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stack.size(); i++) {
            sb.append(stack.elementAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "abBAcC";
        p1544 sol = new p1544();
        System.out.println(sol.makeGood(str));
    }
}
