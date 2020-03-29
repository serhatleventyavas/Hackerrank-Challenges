package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ManasaAndStonesTest {

    private ManasaAndStones SUT;

    @BeforeEach
    public void setUp() throws Exception {
        SUT = new ManasaAndStones();
    }

    @Test
    public void testCase1() throws Exception {
        int[] result = SUT.stones(3, 1, 2);
        assertThat(result, is(new int[] { 2, 3, 4 }));
    }

    @Test
    public void testCase2() throws Exception {
        int[] result = SUT.stones(4, 10, 100);
        assertThat(result, is(new int[] { 30, 120, 210, 300 }));
    }

    @Test
    public void testCase3() throws Exception {
        int[] result = SUT.stones(5, 3, 23);
        assertThat(result, is(new int[] {12, 32, 52, 72, 92}));
    }

    @Test
    public void testCase4() throws Exception {
        int[] result = SUT.stones(12, 73, 82);
        assertThat(result, is(new int[] {803, 812, 821, 830, 839, 848, 857, 866, 875, 884, 893, 902}));
    }

    @Test
    public void testCase5() throws Exception {
        int[] result = SUT.stones(73, 25, 25);
        assertThat(result, is(new int[] { 1800 }));
    }
}