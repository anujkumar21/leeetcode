package com.leetcode.dynamic_programing;

public class MaximumScore {

    int[] nums, multipliers;
    int n, m;
    int[][] memo;


    public int maximumScore(int[] nums, int[] multipliers) {
        this.nums = nums;
        this.multipliers = multipliers;
        this.n = nums.length;
        this.m = multipliers.length;
        memo = new int[m + 1][m + 1];
        return dp(0, 0);
    }

    private int dp(int left, int i) {
        if (i == m) return 0;

        if (memo[left][i] == 0) {
            int right = n - 1 - (i - left);

            int pickLeft = nums[left] * multipliers[i] + dp(left + 1, i + 1);
            int pickRight = nums[right] * multipliers[i] + dp(left, i + 1);

            memo[left][i] = Math.max(pickLeft, pickRight);
        }

        return memo[left][i];
    }

}