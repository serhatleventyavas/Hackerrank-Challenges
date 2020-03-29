package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SequenceEquationTest {

    private SequenceEquation SUT;

    @BeforeEach
    public void setup() {
        SUT = new SequenceEquation();
    }

    @Test
    public void permutationEquation_testCase1() {
        int[] result = SUT.permutationEquation(new int[] {5,2,1,3,4});
        assertThat(result, is(new int[] {4, 2, 5, 1, 3}));
    }
}