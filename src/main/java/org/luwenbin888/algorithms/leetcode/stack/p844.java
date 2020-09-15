package org.luwenbin888.algorithms.leetcode.stack;

import java.util.Stack;

public class p844 {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();

        for (char s: S.toCharArray()) {
            if (s != '#') stackS.push(s);
            else {
                if (!stackS.isEmpty()) stackS.pop();
            }
        }

        for (char t: T.toCharArray()) {
            if (t != '#') stackT.push(t);
            else {
                if (!stackT.isEmpty()) stackT.pop();
            }
        }

        if (stackS.size() != stackT.size()) return false;
        while (!stackS.isEmpty()) {
            if (stackS.pop() != stackT.pop()) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String S = "a#c";
        String T = "b";

        p844 sol = new p844();
        System.out.println(sol.backspaceCompare(S, T));
    }
}
