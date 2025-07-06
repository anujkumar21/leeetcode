package com.leetcode.dynamic_programing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseRobberTest {

    @Test
    public void testRob_SimpleCase() {
        HouseRobber hr = new HouseRobber();
        int[] nums = {1, 2, 3, 1};
        assertEquals(4, hr.rob(nums));
    }

    @Test
    public void testRob_AllSame() {
        HouseRobber hr = new HouseRobber();
        int[] nums = {2, 2, 2, 2};
        assertEquals(4, hr.rob(nums));
    }

    @Test
    public void testRob_SingleElement() {
        HouseRobber hr = new HouseRobber();
        int[] nums = {5};
        assertEquals(5, hr.rob(nums));
    }

    @Test
    public void testRob_TwoElements() {
        HouseRobber hr = new HouseRobber();
        int[] nums = {2, 3};
        assertEquals(3, hr.rob(nums));
    }

    @Test
    public void testRob_Zeroes() {
        HouseRobber hr = new HouseRobber();
        int[] nums = {0, 0, 0, 0};
        assertEquals(0, hr.rob(nums));
    }

    @Test
    public void testRob_LargeInput() {
        HouseRobber hr = new HouseRobber();
        int[] nums = {6, 7, 1, 30, 8, 2, 4};
        assertEquals(41, hr.rob(nums));
    }
}
