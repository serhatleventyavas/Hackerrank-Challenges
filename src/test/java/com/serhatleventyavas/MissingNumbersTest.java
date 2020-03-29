package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class MissingNumbersTest {

    private MissingNumbers SUT;

    @BeforeEach
    public void setUp() {
        SUT = new MissingNumbers();
    }

    @Test
    public void missingNumbers_testCase1() {
        int[] result = SUT.missingNumbers(
                new int[] { 203, 204, 205, 206, 207, 208, 203, 204, 205, 206 },
                new int[] { 203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204 }
        );
        assertThat(result, is(new int[] { 204, 205, 206 }));
    }

    @Test
    public void missingNumbers_testCase2() {

    }
}