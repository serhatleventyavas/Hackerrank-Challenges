package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BreakingTheRecordsTest {

    private BreakingTheRecords SUT;

    @BeforeEach
    public void setup() {
        SUT = new BreakingTheRecords();
    }

    @Test
    public void breakingRecords_testCase1() {
        int[] result = SUT.breakingRecords(new int[] {3, 4, 21, 36, 10, 28, 35, 5, 24, 42});
        assertThat(result, is(new int[] { 4, 0 }));
    }
}