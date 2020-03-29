package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ModifiedKaprekarNumbersTest {

    private ModifiedKaprekarNumbers SUT;

    @BeforeEach
    public void setUp() {
        SUT = new ModifiedKaprekarNumbers();
    }

    @Test
    public void testCase1() {
        String result = SUT.kaprekarNumbers(1, 100);
        assertThat(result, is("1 9 45 55 99"));
    }
}