package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CircularArrayNotationTest {

    private CircularArrayNotation SUT;

    @BeforeEach
    public void setUp() {
        SUT = new CircularArrayNotation();
    }

    @Test
    public void circularArrayNotation_testCase1() {
        int[] result = SUT.circularArrayRotation(new int[] {3, 4, 5}, 2, new int[] {1, 2});
        assertThat(result, is(new int[] { 5, 3 }));
    }
}