package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class JimAndTheOrdersTest {

    private JimAndTheOrders SUT;

    @BeforeEach
    public void setup() {
        SUT = new JimAndTheOrders();
    }

    @Test
    public void testCase1() {
        int[] result = SUT.jimOrders(new int[][]{
                { 8, 1 },
                { 4, 2 },
                { 5, 6 },
                { 3, 1 },
                { 4, 3 }
        });
        assertThat(result, is(new int[] { 4, 2, 5, 1, 3 }));
    }
}