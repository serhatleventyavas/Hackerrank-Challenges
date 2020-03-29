package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class AngryProfessorTest {

    private AngryProfessor SUT;

    @BeforeEach
    public void setup() {
        SUT = new AngryProfessor();
    }

    @Test
    public void angryProfessor_testCase1() {
        String result = SUT.angryProfessor(3, new int[] { -1, -3, 4, 2 });
        assertThat(result, is("YES"));
    }

    @Test
    public void angryProfessor_testCase2() {
        String result = SUT.angryProfessor(2, new int[] { 0, -1, 2, 1 });
        assertThat(result, is("NO"));
    }

}