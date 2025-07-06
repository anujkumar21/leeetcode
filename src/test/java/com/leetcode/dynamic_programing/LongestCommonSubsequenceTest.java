package com.leetcode.dynamic_programing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonSubsequenceTest {

    LongestCommonSubsequence lcs = new LongestCommonSubsequence();

    @Test
    void testExampleCase() {
        assertEquals(3, lcs.longestCommonSubsequence("abcde", "ace")); // common: "ace"
    }

    @Test
    void testNoCommonSubsequence() {
        assertEquals(0, lcs.longestCommonSubsequence("abc", "def"));
    }

    @Test
    void testAllCommon() {
        assertEquals(3, lcs.longestCommonSubsequence("abc", "abc"));
    }

    @Test
    void testOneEmptyString() {
        assertEquals(0, lcs.longestCommonSubsequence("", "abc"));
        assertEquals(0, lcs.longestCommonSubsequence("abc", ""));
    }

    @Test
    void testBothEmptyStrings() {
        assertEquals(0, lcs.longestCommonSubsequence("", ""));
    }

    @Test
    void testCaseSensitivity() {
        assertEquals(0, lcs.longestCommonSubsequence("ABC", "abc"));
    }

    @Test
    void testSingleCharMatch() {
        assertEquals(1, lcs.longestCommonSubsequence("a", "a"));
    }

    @Test
    void testSingleCharNoMatch() {
        assertEquals(0, lcs.longestCommonSubsequence("a", "b"));
    }

    @Test
    void testPartialOverlap() {
        assertEquals(2, lcs.longestCommonSubsequence("abc", "bac")); // "ac" or "bc"
    }

    @Test
    void testRepeatedChars() {
        assertEquals(2, lcs.longestCommonSubsequence("aab", "azb")); // "ab"
    }
}
