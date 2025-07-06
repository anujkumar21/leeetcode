package com.leetcode.dynamic_programing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonSubsequenceParameterizedTest {

    LongestCommonSubsequence lcs = new LongestCommonSubsequence();

    @ParameterizedTest
    @CsvSource({
            // Basic cases
            "'abcde', 'ace', 3, Common subsequence: ace",
            "'abc', 'def', 0, No characters in common",
            "'abc', 'abc', 3, Both strings are identical",
            "'', 'abc', 0, First string is empty",
            "'abc', '', 0, Second string is empty",
            "'', '', 0, Both strings are empty",
            "'ABC', 'abc', 0, Case-sensitive, so no match",
            "'a', 'a', 1, Single character match",
            "'a', 'b', 0, Single character, no match",
            "'abc', 'bac', 2, Multiple possible common subsequences ('ac' or 'bc')",
            "'aab', 'azb', 2, Repeated characters, LCS is 'ab'",

            // Added cases
            "'abcdef', 'fbdamn', 2, Non-contiguous match (b, d)",
            "'longest', 'stone', 3, Multiple matches with gaps (o, n, e)",
            "'abcdefg', 'bdg', 3, Interleaved match (b, d, g)",
            "'aaaa', 'aa', 2, Repeated characters in both strings",
            "'abcabc', 'abc', 3, LCS is just 'abc' at the start",
            "'axbycz', 'abc', 3, Every other character matches",
            "'abac', 'cab', 2, Subsequence from scrambled input (a, b)",
            "'xaybz', 'abz', 3, Partial overlap at end",
            "'qwerty', 'erty', 4, Common tail",
            "'ace', 'abcde', 3, LCS is shorter string (ace)",
            "'abab', 'baba', 3, Alternating characters, max LCS is 3",
            "'aaaaa', 'aaa', 3, Longer repeated chars in one string",
            "'12345', '54321', 1, Numbers, only one common digit per order"
    })
    void shouldReturnCorrectLcsLength(String s1, String s2, int expected, String description) {
        assertEquals(expected, lcs.longestCommonSubsequence(s1, s2), description);
    }
}
