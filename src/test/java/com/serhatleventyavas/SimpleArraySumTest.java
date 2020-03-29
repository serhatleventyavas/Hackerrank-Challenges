package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SimpleArraySumTest {

    private SimpleArraySum SUT;

    @BeforeEach
    public void setup() {
        SUT = new SimpleArraySum();
    }

    @Test
    public void testCase1() {
        int result = SUT.simpleArraySum(new int[] { 1, 2, 3, 4, 10, 11 });
        assertThat(result, is(31));
    }
}