package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class StrongPasswordTest {

    private StrongPassword SUT;

    @BeforeEach
    public void setUp() {
        SUT = new StrongPassword();
    }

    @Test
    public void minimumNumber_testCase1() {
        int result = SUT.minimumNumber("#HackerRank".length(), "#HackerRank");
        assertThat(result, is(1));
    }

    @Test
    public void minimumNumber_testCase2() {
        int result = SUT.minimumNumber("Ab1".length(), "Ab1");
        assertThat(result, is(3));
    }

}