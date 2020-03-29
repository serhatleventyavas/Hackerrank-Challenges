package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BeautifulTripletsTest {

    private BeautifulTriplets SUT;

    @BeforeEach
    public void setUp() {
        SUT = new BeautifulTriplets();
    }

    @Test
    public void beautifulTriplets_testCase1() {
        int result = SUT.beautifulTriplets(3, new int[] {1, 2, 4, 5, 7, 8, 10});
        assertThat(result, is(3));
    }
}