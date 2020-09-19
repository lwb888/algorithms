package org.luwenbin888.algorithms.leetcode.recursion;

public class jzoffer10 {
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int f0 = 0, f1 = 1;
        for (int i = 2; i <= n; i++) {
            int tmp = f0 + f1;
            f0 = f1;
            f1 = tmp % 1000000007;
        }

        return f1 % 1000000007;
    }

    public static void main(String[] args) {
        jzoffer10 sol = new jzoffer10();
        System.out.println(sol.fib(48));
    }
}
