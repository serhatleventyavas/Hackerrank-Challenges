package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ServiceLaneTest {

    private ServiceLane SUT;

    @BeforeEach
    public void setUp() {
        SUT = new ServiceLane() ;
    }

    @Test
    public void serviceLane_testCase1() {
        int[] witdh = new int[] { 2, 3, 1, 2, 3, 2, 3, 3 };
        int[][] testCase = new int[5][2];
        testCase[0] = new int[] { 0, 3 };
        testCase[1] = new int[] { 4, 6 };
        testCase[2] = new int[] { 6, 7 };
        testCase[3] = new int[] { 3, 5 };
        testCase[4] = new int[] { 0, 7 };
        int[] result = SUT.serviceLane(witdh, witdh.length, testCase);
        assertThat(result, is(new int[] { 1, 2, 3, 2, 1 }));
    }
}