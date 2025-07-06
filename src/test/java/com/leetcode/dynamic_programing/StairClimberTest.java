package com.leetcode.dynamic_programing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StairClimberTest {

    @Test
    public void testExample1() {
        StairClimber sc = new StairClimber();
        int[] cost = {10, 15, 20};
        assertEquals(15, sc.minCostClimbingStairs(cost));
    }

    @Test
    public void testExample2() {
        StairClimber sc = new StairClimber();
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        assertEquals(6, sc.minCostClimbingStairs(cost));
    }

    @Test
    public void testSingleStep() {
        StairClimber sc = new StairClimber();
        int[] cost = {5};
        assertEquals(5, sc.minCostClimbingStairs(cost));
    }

    @Test
    public void testTwoSteps() {
        StairClimber sc = new StairClimber();
        int[] cost = {5, 10};
        assertEquals(5, sc.minCostClimbingStairs(cost));
    }

    @Test
    public void testZeroCosts() {
        StairClimber sc = new StairClimber();
        int[] cost = {0, 0, 0, 0};
        assertEquals(0, sc.minCostClimbingStairs(cost));
    }

    @Test
    public void testIncreasingCosts() {
        StairClimber sc = new StairClimber();
        int[] cost = {1, 2, 3, 4, 5, 6};
        assertEquals(9, sc.minCostClimbingStairs(cost));
    }
}
