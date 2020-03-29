package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BirthdayChocolateTest {

    private  BirthdayChocolate SUT;

    @BeforeEach
    public void setup() {
        SUT = new BirthdayChocolate();
    }

    @Test
    public void birthday_testCase1() {
        int[] testCase = new int[] {1, 2, 1, 3, 2};
        int result = SUT.birthday(testCase, 3, 2);
        assertThat(result, is(2));
    }

    @Test
    public void birthday_testCase2() {
        int[] testCase = new int[] {1, 1, 1, 1, 1, 1};
        int result = SUT.birthday(testCase, 3, 2);
        assertThat(result, is(0));
    }

    @Test
    public void birthday_testCase3() {
        int[] testCase = new int[] {4};
        int result = SUT.birthday(testCase, 4, 1);
        assertThat(result, is(1));

    }
}