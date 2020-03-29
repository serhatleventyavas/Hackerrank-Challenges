package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class PriyankaAndToysTest {

    private PriyankaAndToys SUT;

    @BeforeEach
    public void setUp() {
        SUT = new PriyankaAndToys();
    }

    @Test
    public void toys_testCase1() {
        int result = SUT.toys(new int[] {1, 2, 3, 21, 7, 12, 14, 21});
        assertThat(result, is(4));
    }

}