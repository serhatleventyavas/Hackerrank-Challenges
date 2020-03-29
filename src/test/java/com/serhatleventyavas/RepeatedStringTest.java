package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class RepeatedStringTest {

    private RepeatedString SUT;

    @BeforeEach
    public void setup() {
        SUT = new RepeatedString();
    }

    @Test
    public void repeatedString_testCase1() {
        long result = SUT.repeatedString("aba", 10);
        assertThat(result, is(7L));
    }

    @Test
    public void repeatedString_testCase2() {
        long result = SUT.repeatedString("cac", 1000000000);
        assertThat(result, is(333333333L));
    }
}