package com.leetcode.dynamic_programing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonSubsequenceBottomUpTest {

    LongestCommonSubsequenceBottomUp lcs = new LongestCommonSubsequenceBottomUp();

    @Test
    void testExampleCase() {
        assertEquals(3, lcs.longestCommonSubsequence("abcde", "ace")); // common: "ace"
    }
}