package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class GridChallengeTest {

    private GridChallenge SUT;

    @BeforeEach
    public void setup() {
        SUT = new GridChallenge();
    }

    @Test
    public void testCase1() {
        String result = SUT.gridChallenge(new String[] {
                "ebacd",
                "fghij",
                "olmkn",
                "trpqs",
                "xywuv"
        });
        assertThat(result, is("YES"));
    }

    @Test
    public void testCase2() {
        String result = SUT.gridChallenge(new String[] {
                "ebacd",
                "aghij",
                "olmkn",
                "trpqs",
                "xywuv"
        });
        assertThat(result, is("NO"));
    }

    @Test
    public void testCase3() {
        String result = SUT.gridChallenge(new String[] {
                "abc",
                "hjk",
                "mpq",
                "rtv"
        });
        assertThat(result, is("YES"));
    }
}