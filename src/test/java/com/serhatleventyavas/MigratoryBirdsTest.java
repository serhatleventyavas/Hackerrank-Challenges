package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class MigratoryBirdsTest {

    private MigratoryBirds SUT;

    @BeforeEach
    public void setup() {
        SUT = new MigratoryBirds();
    }

    @Test
    public void migratoryBirds_testCase1() {
        List<Integer> testCase = new ArrayList<>();
        testCase.add(1);
        testCase.add(2);
        testCase.add(3);
        testCase.add(4);
        testCase.add(5);
        testCase.add(4);
        testCase.add(3);
        testCase.add(2);
        testCase.add(1);
        testCase.add(3);
        testCase.add(4);

        int result = SUT.migratoryBirds(testCase);
        assertThat(result, is(3));
    }

}