package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class DivisibleSumPairsTest {

    public DivisibleSumPairs SUT;

    @BeforeEach
    public void setup() {
        SUT = new DivisibleSumPairs();
    }

    @Test
    public void divisibleSumPairs_testCase1() {
        int[] testCase = new int[] {1, 3, 2, 6, 1, 2};
        int result = SUT.divisibleSumPairs(testCase.length, 3, testCase);
        assertThat(result, is(5));
    }
}