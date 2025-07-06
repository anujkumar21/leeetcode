package com.leetcode.dynamic_programing;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DeleteAndEarnTest {

    @Test
    public void test() {
        DeleteAndEarn de = new DeleteAndEarn();
        int[] nums = {3, 4, 2};
        assertEquals(6, de.deleteAndEarn(nums));
    }

    @Test
    public void test1() {
        DeleteAndEarn de = new DeleteAndEarn();
        int[] nums = {2, 2, 3, 3, 3, 4};
        assertEquals(9, de.deleteAndEarn(nums));
    }

    @Test
    public void test2() {
        DeleteAndEarn de = new DeleteAndEarn();
        int[] nums = {8, 3, 4, 7, 6, 6, 9, 2, 5, 8, 2, 4, 9, 5, 9, 1, 5, 7, 1, 4};
        assertEquals(61, de.deleteAndEarn(nums));
    }

    @Test
    public void test3() {
        DeleteAndEarn de = new DeleteAndEarn();
        int[] nums = {1, 1, 1, 2, 4, 5, 5, 5, 6};
        assertEquals(18, de.deleteAndEarn(nums));
    }

    @Test
    public void testBasicCase() {
        DeleteAndEarn solver = new DeleteAndEarn();
        int[] nums = {3, 4, 2};
        assertEquals(6, solver.deleteAndEarn(nums));
        // Explanation: take 4 => earn 4, deletes 3; take 2 => earn 2; total = 6
    }

    @Test
    public void testAllSameNumbers() {
        DeleteAndEarn solver = new DeleteAndEarn();
        int[] nums = {5, 5, 5};
        assertEquals(15, solver.deleteAndEarn(nums));
    }

    @Test
    public void testNonConsecutiveNumbers() {
        DeleteAndEarn solver = new DeleteAndEarn();
        int[] nums = {2, 2, 3, 3, 4};
        assertEquals(8, solver.deleteAndEarn(nums));
        // take 3 (6), removes 2 and 4; 6 is max
    }

    @Test
    public void testLargeGap() {
        DeleteAndEarn solver = new DeleteAndEarn();
        int[] nums = {10, 100, 200};
        assertEquals(310, solver.deleteAndEarn(nums));
        // No numbers are adjacent, take all
    }

    @Test
    public void testEmptyArray() {
        DeleteAndEarn solver = new DeleteAndEarn();
        int[] nums = {};
        assertEquals(0, solver.deleteAndEarn(nums));
    }

    @Test
    public void testSingleElement() {
        DeleteAndEarn solver = new DeleteAndEarn();
        int[] nums = {8};
        assertEquals(8, solver.deleteAndEarn(nums));
    }

    @Test
    public void testLargerInput() {
        DeleteAndEarn solver = new DeleteAndEarn();
        int[] nums = {1, 1, 1, 2, 4, 5, 5, 5, 6};
        assertEquals(18, solver.deleteAndEarn(nums));
    }


    // 1. Edge Case Tests
    @Test
    public void testLargeInputWithDuplicates() {
        DeleteAndEarn solver = new DeleteAndEarn();
        int[] nums = new int[10000];
        Arrays.fill(nums, 10000);  // All elements are 10000
        assertEquals(10000 * 10000, solver.deleteAndEarn(nums));
    }

    @Test
    public void testAlternatePattern() {
        DeleteAndEarn solver = new DeleteAndEarn();
        int[] nums = new int[1000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (i % 2 == 0) ? 2 : 3;
        }
        assertEquals(1500, solver.deleteAndEarn(nums));
        // 500 * 2 + 500 * 3 = 2500; taking 3 removes 2; 1500 is better
    }

    //2. Performance / Stress Test
    //@Test
    public void testPerformanceLargeRandomInput() {
        DeleteAndEarn solver = new DeleteAndEarn();
        Random rand = new Random(42);  // fixed seed for reproducibility
        int[] nums = new int[100_000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(10_001);  // values from 0 to 10000
        }

        assertDoesNotThrow(() -> solver.deleteAndEarn(nums));
    }

}