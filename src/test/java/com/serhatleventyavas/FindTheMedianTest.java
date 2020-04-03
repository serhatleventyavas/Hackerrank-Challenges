package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class FindTheMedianTest {

    private FindTheMedian SUT;

    @BeforeEach
    public void setup() {
        SUT = new FindTheMedian();
    }

    @Test
    public void testCase1() {
        int result = SUT.findMedian(new int[] { 0, 1, 2, 4, 6, 5, 3 });
        assertThat(result, is(3));
    }
}