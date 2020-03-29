package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class UtopianTreeTest {

    private UtopianTree SUT;

    @BeforeEach
    public void setup() {
        SUT = new UtopianTree();
    }

    @Test
    public void testCase1() {
        int result = SUT.utopianTree(0);
        assertThat(result, is(1));
    }

    @Test
    public void testCase2() {
        int result = SUT.utopianTree(1);
        assertThat(result, is(2));
    }

    @Test
    public void testCase3() {
        int result = SUT.utopianTree(4);
        assertThat(result, is(7));
    }
}