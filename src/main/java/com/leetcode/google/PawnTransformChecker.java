package com.leetcode.google;

public class PawnTransformChecker {
    public static boolean canTransform(String initial, String target) {
        // Step 1: Remove dashes and check RL sequence
        String initialRL = initial.replaceAll("-", "");
        String targetRL = target.replaceAll("-", "");
        if (!initialRL.equals(targetRL)) return false;

        // Step 2: Check move constraints for R and L
        int n = initial.length();
        int m = target.length();

        // Collect the indexes of R and L in both strings
        int[] initialPos = new int[initialRL.length()];
        int[] targetPos = new int[targetRL.length()];
        int idx = 0, tdx = 0;
        for (int i = 0; i < n; i++) {
            if (initial.charAt(i) != '-') initialPos[idx++] = i;
        }
        for (int i = 0; i < m; i++) {
            if (target.charAt(i) != '-') targetPos[tdx++] = i;
        }

        // Now check the allowed directions
        for (int i = 0; i < initialRL.length(); i++) {
            char c = initialRL.charAt(i);
            int from = initialPos[i], to = targetPos[i];
            if (c == 'R' && to < from) return false; // R can't move left
            if (c == 'L' && to > from) return false; // L can't move right
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canTransform("R-----L", "--RL---")); // true
        System.out.println(canTransform("R-----L", "--LR---")); // false
        System.out.println(canTransform("R---R--L", "-R-R---L")); // true
    }
}
