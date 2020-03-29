package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class AcmIcpcTeamTest {

    private AcmIcpcTeam SUT;

    @BeforeEach
    public void setUp() throws Exception {
        SUT = new AcmIcpcTeam();
    }

    @Test
    public void test1() {
        String[] list = new String[] {
                "10101",
                "11100",
                "11010",
                "00101"
        };

        int[] result = SUT.acmTeam(list);
        assertThat(result, is(new int[] {5, 2}));
    }

    @Test
    public void test2() {
        String[] list = new String[] {
                "10101",
                "11110",
                "00010"
        };

        int[] result = SUT.acmTeam(list);
        assertThat(result, is(new int[] {5, 1}));
    }

}