package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ViralAdvertisingTest {

    private ViralAdvertising SUT;

    @BeforeEach
    public void setup() {
        SUT = new ViralAdvertising();
    }

    @Test
    public void viralAdvertising_testCase1() {
        int result = SUT.viralAdvertising(5);
        assertThat(result, is(24));
    }
}