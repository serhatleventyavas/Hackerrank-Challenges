package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class BonAppetitTest {

    private BonAppetit SUT;

    @BeforeEach
    public void setup() {
        SUT = new BonAppetit();
    }

    @Test
    public void bonAppetit_testCase1() {
        List<Integer> orderItems = new ArrayList<>();
        orderItems.add(3);
        orderItems.add(10);
        orderItems.add(2);
        orderItems.add(9);

        String result = SUT.bonAppetit(orderItems, 1, 7);
        assertThat(result, is("Bon Appetit"));
    }

    @Test
    public void bonAppetit_testCase2() {
        List<Integer> orderItems = new ArrayList<>();
        orderItems.add(3);
        orderItems.add(10);
        orderItems.add(2);
        orderItems.add(9);

        String result = SUT.bonAppetit(orderItems, 1, 12);
        assertThat(result, is("5"));
    }

}