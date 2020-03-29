package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CavitMapTest {

    private CavitMap SUT;

    @BeforeEach
    public void setUp() throws Exception {
        SUT = new CavitMap();
    }

    @Test
    public void cavitMap_testCase1() {
        String[] result = SUT.cavityMap(new String[] {"1112", "1912", "1892", "1234"});
        assertThat(result, is(new String[] {"1112", "1X12", "18X2", "1234"}));
    }

    @Test
    public void cavitMap_testCase2() {
        String[] result = SUT.cavityMap(new String[] {"1 2", "1 2"});
        assertThat(result, is(new String[] {"1 2", "1 2"}));
    }
}