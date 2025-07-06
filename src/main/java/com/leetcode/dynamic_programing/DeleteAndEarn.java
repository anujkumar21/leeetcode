package com.leetcode.dynamic_programing;

import java.util.HashMap;
import java.util.Map;

public class DeleteAndEarn {
    private final Map<Integer, Integer> points = new HashMap<>();
    private final Map<Integer, Integer> memo = new HashMap<>();

    /**
     * Time and Space Complexity
     * Time Complexity: O(n + m)
     * n = length of nums
     * m = max value in nums
     * Space Complexity: O(m)
     * For the points and memo maps.
     */
    public int deleteAndEarn(int[] nums) {
        int maxNum = 0;
        for (int num : nums) {
            points.put(num, points.getOrDefault(num, 0) + num);
            maxNum = Math.max(maxNum, num);
        }
        return maxPoints(maxNum);
    }

    private int maxPoints(int num) {
        if (num == 0 || num == 1) return points.getOrDefault(num, 0);

        if (memo.containsKey(num)) return memo.get(num);

        // Recurrence relation:
        // maxPoints(num) = max(maxPoints(num - 1), maxPoints(num - 2) + points[num])
        // where points[num] = sum of all occurrences of num in nums
        int gain = points.getOrDefault(num, 0);
        memo.put(num, Math.max(maxPoints(num - 1), maxPoints(num - 2) + gain));

        return memo.get(num);
    }

    public int deleteAndEarnBottumUp(int[] nums) {
        if (nums.length == 0) return 0;
        int maxNum = 0;
        for (int num : nums) {
            points.put(num, points.getOrDefault(num, 0) + num);
            maxNum = Math.max(maxNum, num);
        }

        int[] maxPoints = new int[maxNum + 1];
        maxPoints[1] = points.getOrDefault(1, 0);

        for (int i = 2; i <= maxNum; i++) {
            int gain = points.getOrDefault(i, 0);
            maxPoints[i] = Math.max(maxPoints[i - 1], maxPoints[i - 2] + gain);
        }

        return maxPoints[maxNum];
    }
}
