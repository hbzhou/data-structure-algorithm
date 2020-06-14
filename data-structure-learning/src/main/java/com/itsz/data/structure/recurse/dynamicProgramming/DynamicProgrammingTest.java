package com.itsz.data.structure.recurse.dynamicProgramming;

public class DynamicProgrammingTest {
    static int n = 8; //机器人个数
    static int[] pre = {0, 0, 0, 0, 1, 0, 2, 3, 5}; //选择这个机器人之后前驱最近机器人下标
    static int[] profit = {5, 1, 8, 4, 6, 3, 2, 4}; //机器人收益
    static int opt[] = new int[n + 1];

    public static void main(String[] args) {
        optimize(8);

        for (int i = 1; i < n + 1; i++) {
            System.out.println(opt[i]);
        }
    }

    public static int optimize(int n) {
        if (n == 0) {
            opt[0] = 0;
            return 0;
        }
        if (opt[n] != 0) {
            return opt[n];
        }
        if (opt[n - 1] == 0) {
            opt[n - 1] = optimize(n - 1);
        }
        if (opt[pre[n]] == 0) {
            opt[pre[n]] = optimize(pre[n]);
        }
        opt[n] = Math.max(optimize(n - 1), optimize(pre[n]) + profit[n - 1]);
        return opt[n];
    }
}
