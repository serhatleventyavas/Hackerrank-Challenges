package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class GemstonesTest {

    private Gemstones SUT;

    @BeforeEach
    public void setup() {
        SUT = new Gemstones();
    }

    @Test
    public void testCase1() {
        int result = SUT.gemstones(new String[] { "abcdde", "baccd", "eeabg" });
        assertThat(result, is(2));
    }
}