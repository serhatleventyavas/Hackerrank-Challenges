package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SockMerchantTest {

    private SockMerchant SUT;

    @BeforeEach
    public void setup() {
        SUT = new SockMerchant();
    }

    @Test
    public void sockMerchant_testCase1() {
        int[] sockArray = new int[] {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int result = SUT.sockMerchant(sockArray.length, sockArray);
        assertThat(result, is(3));
    }

}