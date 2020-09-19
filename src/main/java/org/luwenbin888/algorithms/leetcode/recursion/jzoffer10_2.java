package org.luwenbin888.algorithms.leetcode.recursion;

public class jzoffer10_2 {
    public int numWays(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (n == 2) return 2;

        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) {
            int tmp = a + b;
            a = b;
            b = tmp % 1000000007;
        }

        return b;
    }
}
