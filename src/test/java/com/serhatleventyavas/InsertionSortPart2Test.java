package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class InsertionSortPart2Test {

    private InsertionSortPart2 SUT;

    @BeforeEach
    public void setup() {
        SUT = new InsertionSortPart2();
    }

    @Test
    public void testCase1() {
        String result = SUT.sort(new int[] {3, 4, 7, 5, 6, 2, 1});

        String answer = "3, 4, 7, 5, 6, 2, 1\n3, 4, 7, 5, 6, 2, 1\n3, 4, 5, 7, 6, 2, 1\n3, 4, 5, 6, 7, 2, 1\n2, 3, 4, 5, 6, 7, 1\n1, 2, 3, 4, 5, 6, 7";
        assertThat(result, is(answer));
    }
}