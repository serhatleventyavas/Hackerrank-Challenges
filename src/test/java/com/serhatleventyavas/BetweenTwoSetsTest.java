package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BetweenTwoSetsTest {

    private BetweenTwoSets SUT;

    @BeforeEach
    public void setup() {
        SUT = new BetweenTwoSets();
    }

    @Test
    public void getTotalX_testCase1() {
        int result = SUT.getTotalX(new int[] { 2, 4 }, new int[] { 16, 32, 96 });
        assertThat(result, is(3));
    }
}
