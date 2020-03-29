package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class StrangeCounterTest {

    private StrangeCounter SUT;

    @BeforeEach
    public void setUp() throws Exception {
        SUT = new StrangeCounter();
    }

    @Test
    public void strangeCounter_testCase1() throws Exception {
        String result = String.valueOf(SUT.strangeCounter(6));
        assertThat(result, is("4"));
    }
    @Test
    public void strangeCounter_testCase2() throws Exception {
        String result = String.valueOf(SUT.strangeCounter(7));
        assertThat(result, is("3"));
    }

    @Test
    public void strangeCounter_testCase7() throws Exception {
        String result = String.valueOf(SUT.strangeCounter(1000000000000L));
        assertThat(result, is("649267441662"));
    }
}