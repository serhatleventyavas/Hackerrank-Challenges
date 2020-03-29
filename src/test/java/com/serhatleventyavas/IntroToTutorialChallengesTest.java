package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class IntroToTutorialChallengesTest {

    private IntroToTutorialChallenges SUT;

    @BeforeEach
    public void setup() {
        SUT = new IntroToTutorialChallenges();
    }

    @Test
    public void testCase1() {
        int result = SUT.introTutorial(4, new int[] { 1, 4, 5, 7, 9, 12 });
        assertThat(result, is(1));
    }

}