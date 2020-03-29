package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class FindDigitsTest {

    private FindDigits SUT;

    @BeforeEach
    public void setup() {
        SUT =  new FindDigits();
    }

    @Test
    public void findDigits_testCase1() {
        int result = SUT.findDigits(12);
        assertThat(result, is(2));
    }

    @Test
    public void findDigits_testCase2() {
        int result = SUT.findDigits(1012);
        assertThat(result, is(3));
    }
}