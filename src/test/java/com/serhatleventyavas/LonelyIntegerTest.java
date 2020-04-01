package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class LonelyIntegerTest {

    private LonelyInteger SUT;

    @BeforeEach
    public void setup() {
        SUT = new LonelyInteger();
    }

    @Test
    public void testCase1() {
        int result = SUT.lonelyinteger(new int[] {1, 1, 2});
        assertThat(result, is(2));
    }



}