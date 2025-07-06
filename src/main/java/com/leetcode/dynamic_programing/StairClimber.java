package com.leetcode.dynamic_programing;

public class StairClimber {
    public int minCostClimbingStairs(int[] cost) {
        int N = cost.length;
        if (N == 1) return cost[0];

        int[] dp = new int[N];
        dp[0] = cost[0];
        dp[1] = Math.min(cost[0] + cost[1], cost[1]);

        for (int i = 2; i < N; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }

        return Math.min(dp[N - 1], dp[N - 2]);
    }
}
