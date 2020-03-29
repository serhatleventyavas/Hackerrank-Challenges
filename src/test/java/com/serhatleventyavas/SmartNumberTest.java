package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SmartNumberTest {

    private SmartNumber SUT;

    @BeforeEach
    public void setUp() {
        SUT = new SmartNumber();
    }

    @Test
    public void isSmartNumber_testCase1() {
        boolean result = SUT.isSmartNumber(1);
        assertThat(result, is(true));
    }

    @Test
    public void isSmartNumber_testCase2() {
        boolean result = SUT.isSmartNumber(2);
        assertThat(result, is(false));
    }

    @Test
    public void isSmartNumber_testCase3() {
        boolean result = SUT.isSmartNumber(7);
        assertThat(result, is(false));
    }

    @Test
    public void isSmartNumber_testCase4() {
        boolean result = SUT.isSmartNumber(169);
        assertThat(result, is(true));
    }
}