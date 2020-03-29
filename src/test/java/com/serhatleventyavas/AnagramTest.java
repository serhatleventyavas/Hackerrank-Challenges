package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class AnagramTest {

    private Anagram SUT;

    @BeforeEach
    public void setup() {
        SUT = new Anagram();
    }

    @Test
    public void anagram_testCase1() {
        int result = SUT.anagram("abc");
        assertThat(result, is(-1));
    }

    @Test
    public void anagram_testCase2() {
        int result = SUT.anagram("aaabbb");
        assertThat(result, is(3));
    }

    @Test
    public void anagram_testCase3() {
        int result = SUT.anagram("ab");
        assertThat(result, is(1));
    }
    @Test
    public void anagram_testCase4() {
        int result = SUT.anagram("mnop");
        assertThat(result, is(2));
    }

    @Test
    public void anagram_testCase5() {
        int result = SUT.anagram("xyyx");
        assertThat(result, is(0));
    }

    @Test
    public void anagram_testCase6() {
        int result = SUT.anagram("xaxbbbxx");
        assertThat(result, is(1));
    }

    @Test
    public void anagram_testCase7() {
        int result = SUT.anagram("asdfjoieufoa");
        assertThat(result, is(3));
    }

    @Test
    public void anagram_testCase8() {
        int result = SUT.anagram("fdhlvosfpafhalll");
        assertThat(result, is(5));
    }

    @Test
    public void anagram_testCase9() {
        int result = SUT.anagram("mvdalvkiopaufl");
        assertThat(result, is(5));
    }
}