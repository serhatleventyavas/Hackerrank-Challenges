package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class MarkAndToysTest {

    private MarkAndToys SUT;

    @BeforeEach
    public void setUp() {
        SUT = new MarkAndToys();
    }

    @Test
    public void maximumToys_testCase1() {
        int result = SUT.maximumToys(new int[] {1, 12, 5, 111, 200, 1000, 10}, 50);
        assertThat(result, is(4));
    }

}