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

    public int minCostClimbingStairsSpaceImproved(int[] cost) {
        int n = cost.length;
        if (n == 1) return cost[0];

        int prev2 = cost[0], prev1 = Math.min(cost[0] + cost[1], cost[1]);
        for (int i = 2; i < n; i++) {
            int curr = Math.min(prev1, prev2) + cost[i];
            prev2 = prev1;
            prev1 = curr;
        }
        return Math.min(prev1, prev2);
    }
}
