package org.luwenbin888.algorithms.lecture.lecture8;

import java.util.Stack;

public class ParenthesesValidator {
    public static boolean validate(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char c: expression.toCharArray()) {
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else {
                if (stack.isEmpty()) return false;
                char pair = stack.pop();
                if (c == ')' && pair == '(' || c == ']' && pair == '[' || c == '}' && pair == '{')
                    continue;
                else return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression = "{[]()[{}]}";
        System.out.println(validate(expression));
    }
}
