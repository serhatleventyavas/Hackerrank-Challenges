package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ClosestNumbersTest {

    private ClosestNumbers SUT;

    @BeforeEach
    public void setup() {
        SUT = new ClosestNumbers();
    }

    @Test
    public void testCase1() {
        int[] result = SUT.closestNumbers(new int[] { 5, 4, 3, 2 });
        assertThat(result, is(new int[] { 2, 3, 3, 4, 4, 5 }));
    }

}