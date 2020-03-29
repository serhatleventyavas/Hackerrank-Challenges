package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SumVsXorTest {

    private SumVsXor SUT;

    @BeforeEach
    public void setUp() throws Exception {
        SUT = new SumVsXor();
    }

    @Test
    public void sumXor_testCase1() {
        long result = SUT.sumXor(5);
        assertThat(String.valueOf(result), is("2"));
    }

    @Test
    public void sumXor_testCase2() {
        long result = SUT.sumXor(10);
        assertThat(String.valueOf(result), is("4"));
    }

}