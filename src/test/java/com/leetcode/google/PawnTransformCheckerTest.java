package com.leetcode.google;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for PawnTransformChecker.
 * 
 * Pawn movement rules:
 * - R pawns can only move right (or stay).
 * - L pawns can only move left (or stay).
 * - The sequence of pawns ('R' and 'L') must not change.
 */
class PawnTransformCheckerTest {

    @Test
    void testCanTransformTrueCases() {
        // R moves right, L moves left, sequence preserved
        assertTrue(PawnTransformChecker.canTransform("R-----L", "--RL---"));

        // No pawns move, positions unchanged
        assertTrue(PawnTransformChecker.canTransform("R--L--R", "R--L--R"));

        // First R slides right, L and second R stay, legal movement
        assertTrue(PawnTransformChecker.canTransform("R--L--R", "--RL--R"));
    }

    @Test
    void testCanTransformFalseCases() {
        // Sequence changes to 'LR', not matching original 'RL'
        assertFalse(PawnTransformChecker.canTransform("R-----L", "--LR---"));

        // Sequence changes to 'LR', not matching original 'RL'
        assertFalse(PawnTransformChecker.canTransform("R---L--", "L---R--"));

        // Sequence changes from 'L' to 'R', not allowed
        assertFalse(PawnTransformChecker.canTransform("L------", "R------"));

        // Second R moves left (from index 4 to 2), which is not allowed
        assertFalse(PawnTransformChecker.canTransform("R---R--L", "-R-R---L"));
    }

    @Test
    void testEmptyOrSinglePawnCases() {
        // No pawns, nothing moves (trivial case)
        assertTrue(PawnTransformChecker.canTransform("-------", "-------"));

        // R stays in place, legal
        assertTrue(PawnTransformChecker.canTransform("R------", "R------"));

        // L stays in place, legal
        assertTrue(PawnTransformChecker.canTransform("------L", "------L"));

        // R moves all the way right, which is allowed
        assertTrue(PawnTransformChecker.canTransform("R------", "------R"));

        // L moves all the way left, which is allowed
        assertTrue(PawnTransformChecker.canTransform("------L", "L------"));

        // L moves right (from index 0 to 6), not allowed
        assertFalse(PawnTransformChecker.canTransform("L------", "------L"));
    }
}
