package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class AlternatingCharactersTest {

    private AlternatingCharacters SUT;

    @BeforeEach
    public void setup() {
        SUT = new AlternatingCharacters();
    }

    @Test
    public void testCase1() {
        int result = SUT.alternatingCharacters("AAAA");
        assertThat(result, is(3));
    }

    @Test
    public void testCase2() {
        int result = SUT.alternatingCharacters("BBBBB");
        assertThat(result, is(4));
    }

    @Test
    public void testCase3() {
        int result = SUT.alternatingCharacters("ABABABAB");
        assertThat(result, is(0));
    }

    @Test
    public void testCase4() {
        int result = SUT.alternatingCharacters("BABABA");
        assertThat(result, is(0));
    }

    @Test
    public void testCase5() {
        int result = SUT.alternatingCharacters("AAABBB");
        assertThat(result, is(4));
    }

}