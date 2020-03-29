package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class EqualizeTheArrayTest {

    private EqualizeTheArray SUT;

    @BeforeEach
    public void setUp() {
        SUT = new EqualizeTheArray();
    }

    @Test
    public void equalizeArray_testCase1() {
        int result = SUT.equalizeArray(new int[] {3, 3, 2, 1, 3});
        assertThat(result, is(2));
    }

    @Test
    public void equalizeArray_testCase2() {
        int result = SUT.equalizeArray(new int[] {1, 2, 2, 3});
        assertThat(result, is(2));
    }
}