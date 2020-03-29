package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class RunningTimeOfAlgorithmsTest {

    private RunningTimeOfAlgorithms SUT;

    @BeforeEach
    public void setUp() {
        SUT = new RunningTimeOfAlgorithms();
    }

    @Test
    public void runningTime_testCase1() {
        int result = SUT.runningTime(new int[] {2, 1, 3, 1, 2});
        assertThat(result, is(4));
    }

}