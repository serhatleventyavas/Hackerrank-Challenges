package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class PangramsTest {

    private Pangrams SUT;

    @BeforeEach
    public void setUp() {
        SUT = new Pangrams();
    }

    @Test
    public void pangrams_testCase1() {
        String result = SUT.pangrams("We promptly judged antique ivory buckles for the next prize");
        assertThat(result, is("pangram"));
    }

    @Test
    public void pangrams_testCase2() {
        String result = SUT.pangrams("We promptly judged antique ivory buckles for the prize");
        assertThat(result, is("not_pangram"));
    }
}