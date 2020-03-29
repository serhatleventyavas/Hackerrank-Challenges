package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class WorkbookOfLisaTest {

    private WorkbookOfLisa SUT;

    @BeforeEach
    public void setUp() throws Exception {
        SUT = new WorkbookOfLisa();
    }

    @Test
    public void workBook_testcase1() {
        int result = SUT.workbook(5, 3, new int[] {4, 2, 6, 1, 10});
        assertThat(result, is(4));
    }
}