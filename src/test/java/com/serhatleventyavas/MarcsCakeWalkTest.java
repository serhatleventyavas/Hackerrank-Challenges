package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class MarcsCakeWalkTest {

    private MarcsCakeWalk SUT;

    @BeforeEach
    public void setup() {
        SUT = new MarcsCakeWalk();
    }

    @Test
    public void testCase1() {
        long result = SUT.marcsCakewalk(new int[] { 7, 4, 9, 6 });
        assertThat(result, is(79L));
    }
}