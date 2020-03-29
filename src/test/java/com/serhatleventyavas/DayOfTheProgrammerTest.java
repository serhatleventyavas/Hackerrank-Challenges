package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class DayOfTheProgrammerTest {

    private DayOfTheProgrammer SUT;

    @BeforeEach
    public void setup() {
        SUT = new DayOfTheProgrammer();
    }

    @Test
    public void testCase1() {
        String result = SUT.dayOfProgrammer(1801);
        assertThat(result, is("13.09.1801"));
    }

}