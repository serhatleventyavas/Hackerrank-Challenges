package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class SherlockAndArrayTest {

    private SherlockAndArray SUT;

    @BeforeEach
    public void setUp() {
        SUT = new SherlockAndArray();
    }

    @Test
    public void balancedSums_testCase1() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(4);
        list.add(1);
        list.add(1);
        String result = SUT.balancedSums(list);
        assertThat(result, is("YES"));
    }

    @Test
    public void balancedSums_testCase2() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        String result = SUT.balancedSums(list);
        assertThat(result, is("NO"));
    }

    @Test
    public void balancedSums_testCase3() {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(0);
        list.add(0);
        list.add(0);
        String result = SUT.balancedSums(list);
        assertThat(result, is("YES"));
    }


    @Test
    public void balancedSums_testCase4() {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(0);
        list.add(2);
        list.add(0);
        String result = SUT.balancedSums(list);
        assertThat(result, is("YES"));
    }

}