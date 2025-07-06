package com.leetcode.dynamic_programing;

public class MaximumScoreBottomUp {
    int[] nums, multipliers;
    int n, m;
    int[][] dp;

    public int maximumScore(int[] nums, int[] multipliers) {
        this.nums = nums;
        this.multipliers = multipliers;
        this.n = nums.length;
        this.m = multipliers.length;
        dp = new int[m + 1][m + 1];

        for (int i = m - 1; i >= 0; i--) {
            int mul = multipliers[i];
            for (int left = i; left >= 0; left--) {
                int right = n - 1 - (i - left);
                int leftPick = mul * nums[left] + dp[i + 1][left + 1];
                int rightPick = mul * nums[right] + dp[i + 1][left];
                dp[i][left] = Math.max(leftPick, rightPick);
            }
        }
        return dp[0][0];
    }
}
