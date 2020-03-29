package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CutTheSticksTest {

    private CutTheSticks SUT;

    @BeforeEach
    public void setup() {
        SUT = new CutTheSticks();
    }

    @Test
    public void cutTheSticks_testCase1() {
        int[] result = SUT.cutTheSticks(new int[] {8, 8, 14, 10, 3, 5, 14, 12});
        assertThat(result, is(new int[] {8, 7, 6, 4, 3, 2}));
    }

    @Test
    public void cutTheSticks_testCase2() {
        int[] result = SUT.cutTheSticks(new int[] {1, 2, 3, 4, 3, 3, 2, 1});
        assertThat(result, is(new int[] {8, 6, 4, 1}));
    }
}