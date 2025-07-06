package com.leetcode.dynamic_programing;

public class LongestCommonSubsequenceBottomUp {

    /**
     * Computes the length of the Longest Common Subsequence between two strings using bottom-up DP.
     *
     * @param text1 First string
     * @param text2 Second string
     * @return Length of LCS
     */
    public int longestCommonSubsequence(String text1, String text2) {
        int N = text1.length();
        int M = text2.length();
        int[][] dp = new int[N + 1][M + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[N][M];
    }


}
