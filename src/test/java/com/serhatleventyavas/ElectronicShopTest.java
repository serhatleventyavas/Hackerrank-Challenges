package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ElectronicShopTest {

    private ElectronicShop SUT;

    @BeforeEach
    public void setup() {
        SUT = new ElectronicShop();
    }

    @Test
    public void getMoneySpent_testCase1() {
        int result = SUT.getMoneySpent(new int[] {4}, new int[] {5}, 5);
        assertThat(result, is(-1));
    }

}