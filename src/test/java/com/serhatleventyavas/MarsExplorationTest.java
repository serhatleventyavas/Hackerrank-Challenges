package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class MarsExplorationTest {

    private MarsExploration SUT;

    @BeforeEach
    public void setUp() {
        SUT = new MarsExploration();
    }

    @Test
    public void marsExploration_testCase1() {
        int result = SUT.marsExploration("SOSSPSSQSSOR");
        assertThat(result, is(3));
    }

    @Test
    public void marsExploration_testCase2() {
        int result = SUT.marsExploration("SOSSOT");
        assertThat(result, is(1));
    }
}