package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BirthdayCakeCandlesTest {

    private BirthdayCakeCandles SUT;

    @BeforeEach
    public void setup() {
        SUT = new BirthdayCakeCandles();
    }

    @Test
    public void birthdayCakeCandles_testCase1() {
        int[] array = new int[] { 3, 2, 1, 3 };
        int result = SUT.birthdayCakeCandles(array);
        assertThat(result, is(2));
    }
}