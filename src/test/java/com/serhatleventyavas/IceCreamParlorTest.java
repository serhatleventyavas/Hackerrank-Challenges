package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class IceCreamParlorTest {

    private IceCreamParlor SUT;

    @BeforeEach
    public void setUp() {
        SUT = new IceCreamParlor();
    }

    @Test
    public void icecreamParlor_testCase1() {
        int[] result = SUT.icecreamParlor(4, new int[] {1, 4, 5, 3, 2});
        assertThat(result, is(new  int[] {1, 4}));
    }

    @Test
    public void icecreamParlor_testCase2() {
        int[] result = SUT.icecreamParlor(4, new int[] {2, 2, 4, 3});
        assertThat(result, is(new  int[] {1, 2}));
    }

}