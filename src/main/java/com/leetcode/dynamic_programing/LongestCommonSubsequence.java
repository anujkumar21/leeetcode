package com.leetcode.dynamic_programing;

public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {
        int N = text1.length();
        int M = text2.length();
        int[][] memo = new int[N][M];
        return dp(text1, text2, N - 1, M - 1, memo);
    }

    private int dp(String text1, String text2, int n, int m, int[][] memo) {
        if (n == -1 || m == -1) return 0;
        if (memo[n][m] != 0) return memo[n][m];
        if (text1.charAt(n) == text2.charAt(m)) return 1 + dp(text1, text2, n - 1, m - 1, memo);
        return Math.max(dp(text1, text2, n - 1, m, memo), dp(text1, text2, n, m - 1, memo));
    }

}
