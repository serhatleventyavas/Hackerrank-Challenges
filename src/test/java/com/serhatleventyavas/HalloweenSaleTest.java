package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class HalloweenSaleTest {

    private HalloweenSale SUT;

    @BeforeEach
    public void setUp() {
        SUT = new HalloweenSale();
    }

    @Test
    public void howManyGames_testCase1() {
        int result = SUT.howManyGames(20, 3, 6, 80);
        assertThat(result, is(6));
    }

    @Test
    public void howManyGames_testCase2() {
        int result = SUT.howManyGames(99, 3, 1, 5555);
        assertThat(result, is(3905));
    }
}