package com.leetcode.google;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PawnTransformCheckerTest {

    @Test
    void testCanTransformTrueCases() {
        assertTrue(PawnTransformChecker.canTransform("R-----L", "--RL---"));
        assertTrue(PawnTransformChecker.canTransform("R---R--L", "-R-R---L"));
        assertTrue(PawnTransformChecker.canTransform("R--L--R", "R--L--R"));
        assertTrue(PawnTransformChecker.canTransform("L------", "------L"));
    }

    @Test
    void testCanTransformFalseCases() {
        assertFalse(PawnTransformChecker.canTransform("R-----L", "--LR---"));
        assertFalse(PawnTransformChecker.canTransform("R---L--", "L---R--"));
        assertFalse(PawnTransformChecker.canTransform("R--L--R", "--RL--R"));
        assertFalse(PawnTransformChecker.canTransform("L------", "R------"));
    }

    @Test
    void testEmptyOrSinglePawnCases() {
        assertTrue(PawnTransformChecker.canTransform("-------", "-------"));
        assertTrue(PawnTransformChecker.canTransform("R------", "R------"));
        assertTrue(PawnTransformChecker.canTransform("------L", "------L"));
        assertFalse(PawnTransformChecker.canTransform("R------", "------R"));
        assertFalse(PawnTransformChecker.canTransform("------L", "L------"));
    }
}
