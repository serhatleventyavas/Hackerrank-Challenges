package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BeautifulDaysAtTheMoviesTest {

    private BeautifulDaysAtTheMovies SUT;

    @BeforeEach
    public void setup() {
        SUT = new BeautifulDaysAtTheMovies();
    }

    @Test
    public void testCase1() {
        int result = SUT.beautifulDays(20, 23,  6);
        assertThat(result, is(2));
    }


}