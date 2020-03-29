package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ChocolateFeastTest {

    private ChocolateFeast SUT;

    @BeforeEach
    public void setUp() {
        SUT = new ChocolateFeast();
    }

    @Test
    public void chocolateFeast_testCase1() {
        int result = SUT.chocolateFeast(10, 2, 5);
        assertThat(result, is(5));
    }

    @Test
    public void chocolateFeast_testCase2() {
        int result = SUT.chocolateFeast(12, 4, 4);
        assertThat(result, is(3));
    }

    @Test
    public void chocolateFeast_testCase3() {
        int result = SUT.chocolateFeast(6, 2, 2);
        assertThat(result, is(4));
    }
}