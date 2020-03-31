package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.crypto.interfaces.PBEKey;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class MaximizingXORTest {

    private MaximizingXOR SUT;

    @BeforeEach
    public void setup() {
        SUT = new MaximizingXOR();
    }

    @Test
    public void testCase1() {
        int result = SUT.maximizingXor(11, 100);
        assertThat(result, is(127));
    }

    @Test
    public void testCase2() {
        int result = SUT.maximizingXor(10, 15);
        assertThat(result, is(7));
    }

}