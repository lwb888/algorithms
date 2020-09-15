package org.luwenbin888.algorithms.leetcode.stack;

import java.util.Stack;

public class p1047 {
    public String removeDuplicates(String s) {
        StringBuilder res = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (res.length() == 0) res.append(c);
            else {
                if (res.charAt(res.length()-1) == c) {
                    res.deleteCharAt(res.length() - 1);
                }
                else res.append(c);
            }
        }

        return res.toString();
    }

    public String removeDuplicates2(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (stack.isEmpty()) stack.push(c);
            else {
                if (stack.peek() == c) stack.pop();
                else stack.push(c);
            }
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < stack.size(); i++) {
            res.append(stack.elementAt(i));
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String str = "abbaca";
        p1047 sol = new p1047();
        System.out.println(sol.removeDuplicates2(str));
    }
}
