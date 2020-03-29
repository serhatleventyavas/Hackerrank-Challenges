package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class TaumAndBDayTest {

    private TaumAndBDay SUT;

    @BeforeEach
    public void setUp() {
        SUT = new TaumAndBDay();
    }


    @Test
    public void test1() {
        long costs = SUT.calculateCosts(3, 5, 3, 4, 1);
        assertThat(costs, is(29L));
    }

    @Test
    public void test2() {
        long costs = SUT.calculateCosts(10, 10, 1, 1, 1);
        assertThat(costs, is(20L));
    }

    @Test
    public void test3() {
        long costs = SUT.calculateCosts(5, 9, 2, 3, 4);
        assertThat(costs, is(37L));
    }

    @Test
    public void test4() {
        long costs = SUT.calculateCosts(3, 6, 9, 1, 1);
        assertThat(costs, is(12L));
    }

    @Test
    public void test5() {
        long costs = SUT.calculateCosts(7, 7, 4, 2, 1);
        assertThat(costs, is(35L));
    }

    @Test
    public void test6() {
        long costs = SUT.calculateCosts(3, 3, 1, 9, 2);
        assertThat(costs, is(12L));
    }

    @Test
    public void test7() {
        long costs = SUT.calculateCosts(27984, 1402, 619246, 615589, 247954);
        assertThat(costs, is(18192035842L));
    }
}