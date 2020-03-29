package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class MinimumDistancesTest {

    private MinimumDistances SUT;

    @BeforeEach
    public void setUp() {
        SUT = new MinimumDistances();
    }

    @Test
    public void minimumDistances_testCase1() {
        int result = SUT.minimumDistances(new int[] {3, 2, 1, 2, 3});
        assertThat(result, is(2));
    }

    @Test
    public void minimumDistances_testCase2() {
        int result = SUT.minimumDistances(new int[] {7, 1, 3, 4, 1, 7});
        assertThat(result, is(3));
    }

    @Test
    public void minimumDistances_testCase3() {
        int result = SUT.minimumDistances(new int[] {1, 2, 3, 4, 10});
        assertThat(result, is(-1));
    }
}