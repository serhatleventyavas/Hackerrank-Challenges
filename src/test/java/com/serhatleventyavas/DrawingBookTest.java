package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class DrawingBookTest {

    private DrawingBook SUT;

    @BeforeEach
    public void setup() {
        SUT = new DrawingBook();
    }

    @Test
    public void pageCount_testCase1() {
        int result = SUT.pageCount(6, 2);
        assertThat(result, is(1));
    }

    @Test
    public void pageCount_testCase2() {
        int result = SUT.pageCount(6, 4);
        assertThat(result, is(1));
    }

    @Test
    public void pageCount_testCase3() {
        int result = SUT.pageCount(5, 4);
        assertThat(result, is(0));
    }
}