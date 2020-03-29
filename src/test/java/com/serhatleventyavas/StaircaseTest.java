package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class StaircaseTest {

    private Staircase SUT;

    @BeforeEach
    public void setup() {
        SUT =  new Staircase();
    }

    @Test
    public void testCase1() {
        String result = SUT.staircase(6);
        assertThat(result, is("     #\n    ##\n   ###\n  ####\n #####\n######\n"));
    }

}