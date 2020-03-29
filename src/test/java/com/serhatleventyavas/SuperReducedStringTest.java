package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SuperReducedStringTest {

    private SuperReducedString SUT;

    @BeforeEach
    public void setUp() {
        SUT = new SuperReducedString();
    }

    @Test
    public void testCase1() {
        String result = SUT.superReducedString("aaabccddd");
        assertThat(result, is("abd"));
    }

    @Test
    public void testCase2() {
        String result = SUT.superReducedString("aa");
        assertThat(result, is("Empty String"));
    }

    @Test
    public void testCase3() {
        String result = SUT.superReducedString("baab");
        assertThat(result, is("Empty String"));
    }
}