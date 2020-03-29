package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class PickingNumbersTest {

    private PickingNumbers SUT;

    @BeforeEach
    public void setup() {
        SUT = new PickingNumbers();
    }

    @Test
    public void pickingNumbers_testCase1() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);

        int result = SUT.pickingNumbers(list);
        assertThat(result, is(5));
    }

    @Test
    public void pickingNumbers_testCase2() {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(5);
        list.add(3);
        list.add(3);
        list.add(1);

        int result = SUT.pickingNumbers(list);
        assertThat(result, is(3));
    }
}