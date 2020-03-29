package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CamelCaseTest {

    private CamelCase SUT;

    @BeforeEach
    public void setup() {
        SUT = new CamelCase();
    }

    @Test
    public void camelcase_testCase1() {
        int result = SUT.camelcase("saveChangesInTheEditor");
        assertThat(result,  is(4));
    }

}