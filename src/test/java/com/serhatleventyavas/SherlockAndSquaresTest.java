package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SherlockAndSquaresTest {

    private SherlockAndSquares SUT;

    @BeforeEach
    public void setup() {
        SUT = new SherlockAndSquares();
    }

    @Test
    public void squares_testCase1() {
        int result = SUT.squares(100, 1000);
        assertThat(result, is(20));
    }

    @Test
    public void squares_testCase2() {
        int result = SUT.squares(3, 9);
        assertThat(result, is(1));
    }

    @Test
    public void squares_testCase3() {
        int result = SUT.squares(17, 24);
        assertThat(result, is(0));
    }
}