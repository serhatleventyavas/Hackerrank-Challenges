package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SolveMeFirstTest {

    private SolveMeFirst SUT;

    @BeforeEach
    public void setup() {
        SUT = new SolveMeFirst();
    }

    @Test
    public void solveMeFirst_testCase1() {
        int result = SUT.solveMeFirst(2, 3);
        assertThat(result, is(5));
    }

}