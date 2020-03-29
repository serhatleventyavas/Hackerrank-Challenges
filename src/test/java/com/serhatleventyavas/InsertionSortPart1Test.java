package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class InsertionSortPart1Test {

    private InsertionSortPart1 SUT;

    @BeforeEach
    public void setup() {
        SUT = new InsertionSortPart1();
    }

    @Test
    public void testCase1() {
        String result = SUT.sort(new int[] {2, 4, 6, 8, 3});
        String answer = "2, 4, 6, 8, 8\n2, 4, 6, 6, 8\n2, 4, 4, 6, 8\n2, 3, 4, 6, 8";
        assertThat(result, is(answer));
    }
}