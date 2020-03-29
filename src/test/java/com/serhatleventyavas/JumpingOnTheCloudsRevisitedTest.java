package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class JumpingOnTheCloudsRevisitedTest {

    private JumpingOnTheCloudsRevisited SUT;

    @BeforeEach
    public void setup() {
        SUT = new JumpingOnTheCloudsRevisited();
    }

    @Test
    public void jumpingOnClouds_testCase1() {
        int[] newArray = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
        int result = SUT.jumpingOnClouds(newArray, 3);
        assertThat(result, is(80));
    }
}