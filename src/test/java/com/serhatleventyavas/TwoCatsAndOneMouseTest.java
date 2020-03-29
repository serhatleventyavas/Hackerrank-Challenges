package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class TwoCatsAndOneMouseTest {

    private TwoCatsAndOneMouse SUT;

    @BeforeEach
    public void setup() {
        SUT = new TwoCatsAndOneMouse();
    }

    @Test
    public void catAndMouse_testCase1() {
        String result = SUT.catAndMouse(1, 2, 3);
        assertThat(result, is("Cat B"));
    }

    @Test
    public void catAndMouse_testCase2() {
        String result = SUT.catAndMouse(1, 3, 2);
        assertThat(result, is("Mouse C"));
    }
}