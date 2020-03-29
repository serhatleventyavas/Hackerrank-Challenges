package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CountingValleysTest {

    private CountingValleys SUT;

    @BeforeEach
    public void setup() {
        SUT = new CountingValleys();
    }

    @Test
    public void countingValleys_testCase1() {
        int result = SUT.countingValleys("UDDDUDUU".length(), "UDDDUDUU");
        assertThat(result, is(1));
    }

}