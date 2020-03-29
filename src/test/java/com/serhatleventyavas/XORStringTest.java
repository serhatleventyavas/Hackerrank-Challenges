package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class XORStringTest {

    private XORString SUT;

    @BeforeEach
    public void setUp()  {
        SUT = new XORString();
    }

    @Test
    public void stringsXOR_testCase1() {
        String result = SUT.stringsXOR("10101", "00101");
        assertThat(result, is("10000"));
    }

}