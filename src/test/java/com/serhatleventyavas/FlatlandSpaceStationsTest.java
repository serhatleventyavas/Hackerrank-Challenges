package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class FlatlandSpaceStationsTest {

    private FlatlandSpaceStations SUT;

    @BeforeEach
    public void setUp() throws Exception {
        SUT = new FlatlandSpaceStations();
    }

    @Test
    public void flatlandSpaceStations_testCase1() {
        int result = SUT.flatlandSpaceStations(5, new int[] {0, 4});
        assertThat(result, is(2));
    }

    @Test
    public void flatlandSpaceStations_testCase2() {
        int result = SUT.flatlandSpaceStations(6, new int[] {0, 1, 2, 3, 4, 5});
        assertThat(result, is(0));
    }

}