package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class JumpingOnTheCloudsTest {

    private JumpingOnTheClouds SUT;

    @BeforeEach
    public void setUp() {
        SUT = new JumpingOnTheClouds();
    }

    @Test
    public void jumpingOnClouds_testCase1() {
        int result = SUT.jumpingOnClouds(new int[] {0, 0, 1, 0, 0, 1, 0});
        assertThat(result, is(4));
    }

    @Test
    public void jumpingOnClouds_testCase2() {
        int result = SUT.jumpingOnClouds(new int[] {0, 0, 0, 0, 1, 0});
        assertThat(result, is(3));
    }

    @Test
    public void jumpingOnClouds_testCase3() {
        int result = SUT.jumpingOnClouds(new int[] {0, 0, 0, 1, 0, 0});
        assertThat(result, is(3));
    }
}