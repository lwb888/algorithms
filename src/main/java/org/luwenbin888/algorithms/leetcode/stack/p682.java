package org.luwenbin888.algorithms.leetcode.stack;

import java.util.Stack;

public class p682 {
    public int calPoints(String[] ops) {
        if (ops == null || ops.length == 0) return 0;

        Stack<Integer> points = new Stack<>();
        for (String round: ops) {
            if (round.equalsIgnoreCase("C")) {
                if (!points.isEmpty()) points.pop();
            }
            else if (round.equalsIgnoreCase("D")) {
                if (!points.isEmpty()) {
                    points.push(points.peek() * 2);
                }
            }
            else if (round.equals("+")) {
                int op1 = 0, op2 = 0;
                if (!points.isEmpty()) {
                    op1 = points.pop();
                    if (!points.isEmpty()) {
                        op2 = points.peek();
                        points.push(op1);
                        points.push(op1 + op2);
                    }
                }
            }
            else {
                points.push(Integer.valueOf(round));
            }
        }

        int sum = 0;
        for (int i = 0; i < points.size(); i++) {
            sum += points.elementAt(i);
        }

        return sum;
    }

    public static void main(String[] args) {
        String[] rounds = {"5","-2","4","C","D","9","+","+"};
        p682 sol = new p682();
        System.out.println(sol.calPoints(rounds));
    }
}
