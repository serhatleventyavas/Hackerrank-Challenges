package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SaveThePrisonerTest {

    private SaveThePrisoner SUT;

    @BeforeEach
    public void setup() {
        SUT = new SaveThePrisoner();
    }

    @Test
    public void saveThePrisoner_testCase1() {
        int result = SUT.saveThePrisoner(7, 21, 2);
        assertThat(result, is(1));
    }

    @Test
    public void saveThePrisoner_testCase2() {
        int result = SUT.saveThePrisoner(7, 19, 2);
        assertThat(result, is(6));
    }

    @Test
    public void saveThePrisoner_testCase3() {
        int result = SUT.saveThePrisoner(3, 7, 3);
        assertThat(result, is(3));
    }

    @Test
    public void saveThePrisoner_testCase4() {
        int result =  SUT.saveThePrisoner(5, 2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void saveThePrisoner_testCase5() {
        int result = SUT.saveThePrisoner(5, 2, 2);
        assertThat(result, is(3));
    }
}