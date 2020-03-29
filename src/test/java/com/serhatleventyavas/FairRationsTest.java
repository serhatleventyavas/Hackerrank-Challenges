package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class FairRationsTest {

    private FairRations SUT;

    @BeforeEach
    public void setUp() throws Exception {
        SUT = new FairRations();
    }

    @Test
    public void fairRations_testCase1() throws Exception {
        String result = SUT.fairRations(new int[] {2, 3, 4, 5, 6});
        assertThat(result, is("4"));
    }

    @Test
    public void fairRations_testCase2() throws Exception {
        String result = SUT.fairRations(new int[] {1, 2});
        assertThat(result, is("NO"));
    }
}