package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class LibraryFineTest {

    private LibraryFine SUT;

    @BeforeEach
    public void setup() {
        SUT = new LibraryFine();
    }

    @Test
    public void libraryFine_testCase1() {
        int result = SUT.libraryFine(1, 1, 2016, 1, 1, 2015);
        assertThat(result, is(10000));
    }

    @Test
    public void libraryFine_testCase2() {
        int result = SUT.libraryFine(9, 6, 2015, 6, 6, 2015);
        assertThat(result, is(0));
    }

}