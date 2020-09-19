package org.luwenbin888.algorithms.leetcode.recursion;

public class p1137 {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;

        int f0 = 0, f1 = 1, f2 = 1;
        int res = 0;
        for (int i = 3; i <= n; i++) {
            res = (f0 + f1 + f2);
            f0 = f1;
            f1 = f2;
            f2 = res;
        }

        return res;
    }

    public static void main(String[] args) {
        p1137 sol = new p1137();
        System.out.println(sol.tribonacci(25));
    }
}
