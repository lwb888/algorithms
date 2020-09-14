package org.luwenbin888.algorithms.leetcode.stack;

import java.util.Stack;

public class p20 {
    public boolean isValid(String s) {
        Stack<Character> operators = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') operators.push(c);
            else {
                if (operators.isEmpty()) return false;
                char pair = operators.pop();
                if (c == ')' && pair != '(' || c == ']' && pair != '[' || c == '}' && pair != '{')
                    return false;
            }
        }

        return operators.isEmpty();
    }

    public static void main(String[] args) {
        String s = "(]";
        p20 sol = new p20();
        System.out.println(sol.isValid(s));
    }
}
