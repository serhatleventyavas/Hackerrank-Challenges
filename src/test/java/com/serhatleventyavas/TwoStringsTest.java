package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class TwoStringsTest {

    private TwoStrings SUT;

    @BeforeEach
    public void setup() {
        SUT = new TwoStrings();
    }

    @Test
    public void testCase1() {
        String result = SUT.twoStrings("hello", "world");
        assertThat(result, is("YES"));
    }

    @Test
    public void testCase2() {
        String result = SUT.twoStrings("hi", "world");
        assertThat(result, is("NO"));
    }
}