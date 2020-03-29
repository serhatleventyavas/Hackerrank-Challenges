package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class AppendAndDeleteTest {

    private AppendAndDelete SUT;

    @BeforeEach
    public void setup() {
        SUT = new AppendAndDelete();
    }

    @Test
    public void appendAndDelete_testCase1() {
        String result = SUT.appendAndDelete("hackerhappy", "hackerrank", 9);
        assertThat(result, is("Yes"));
    }

    @Test
    public void appendAndDelete_testCase2() {
        String result = SUT.appendAndDelete("aba", "aba", 7);
        assertThat(result, is("Yes"));
    }

    @Test
    public void appendAndDelete_testCase3() {
        String result = SUT.appendAndDelete("ashley", "ash", 2);
        assertThat(result, is("No"));

    }
}