package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class HackerRankInAStringTest {


    private HackerRankInAString SUT;

    @BeforeEach
    public void setUp() {
        SUT = new HackerRankInAString();
    }

    @Test
    public void testCase1() {
        String result = SUT.hackerrankInString("hackerrankInString");
        assertThat(result, is("YES"));
    }

    @Test
    public void testCase2() {
        String result = SUT.hackerrankInString("hackerworld");
        assertThat(result, is("NO"));
    }
}