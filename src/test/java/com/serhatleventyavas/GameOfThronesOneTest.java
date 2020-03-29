package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class GameOfThronesOneTest {

    private GameOfThronesOne SUT;

    @BeforeEach
    public void setup() {
        SUT = new GameOfThronesOne();
    }

    @Test
    public void gameOfThrones_testCase1() {
        String result = SUT.gameOfThrones("aaabbbb");
        assertThat(result, is("YES"));
    }

    @Test
    public void gameOfThrones_testCase2() {
        String result = SUT.gameOfThrones("cdefghmnopqrstuvw");
        assertThat(result, is("NO"));
    }

}