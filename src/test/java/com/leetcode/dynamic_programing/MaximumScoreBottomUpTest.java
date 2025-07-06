package com.leetcode.dynamic_programing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumScoreBottomUpTest {
    @Test
    public void testExampleCase() {
        MaximumScoreBottomUp sol = new MaximumScoreBottomUp();
        int[] nums = {-5, -3, -3, -2, 7, 1};
        int[] multipliers = {-10, -5, 3, 4, 6};
        assertEquals(102, sol.maximumScore(nums, multipliers));
    }

    @Test
    public void testAllPositive() {
        MaximumScoreBottomUp sol = new MaximumScoreBottomUp();
        int[] nums = {1, 2, 3};
        int[] multipliers = {3, 2, 1};
        assertEquals(14, sol.maximumScore(nums, multipliers));
    }

    @Test
    public void testAllNegative() {
        MaximumScoreBottomUp sol = new MaximumScoreBottomUp();
        int[] nums = {-1, -2, -3};
        int[] multipliers = {-3, -2, -1};
        assertEquals(14, sol.maximumScore(nums, multipliers)); // negative * negative = positive
    }

    @Test
    public void testSingleElement() {
        MaximumScoreBottomUp sol = new MaximumScoreBottomUp();
        int[] nums = {10};
        int[] multipliers = {5};
        assertEquals(50, sol.maximumScore(nums, multipliers));
    }

    @Test
    public void testEmptyMultipliers() {
        MaximumScoreBottomUp sol = new MaximumScoreBottomUp();
        int[] nums = {10, 20, 30};
        int[] multipliers = {};
        assertEquals(0, sol.maximumScore(nums, multipliers));
    }

    @Test
    public void testZeroes() {
        MaximumScoreBottomUp sol = new MaximumScoreBottomUp();
        int[] nums = {0, 0, 0};
        int[] multipliers = {0, 0, 0};
        assertEquals(0, sol.maximumScore(nums, multipliers));
    }

    @Test
    public void testNegativeMultipliers() {
        MaximumScoreBottomUp sol = new MaximumScoreBottomUp();
        int[] nums = {5, 10, 20};
        int[] multipliers = {-1, -2, -3};
        assertEquals(-55, sol.maximumScore(nums, multipliers));
    }

    @Test
    public void testEmptyArrays() {
        MaximumScoreBottomUp sol = new MaximumScoreBottomUp();
        int[] nums = {};
        int[] multipliers = {};
        assertEquals(0, sol.maximumScore(nums, multipliers));
    }

    @Test
    public void testNumsLongerThanMultipliers() {
        MaximumScoreBottomUp sol = new MaximumScoreBottomUp();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] multipliers = {2, 3, 4};
        // Only three picks, should maximize result (e.g., 7*2 + 6*3 + 5*4 = 14+18+20=52)
        assertEquals(52, sol.maximumScore(nums, multipliers));
    }
}