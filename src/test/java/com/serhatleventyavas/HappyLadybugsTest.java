package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class HappyLadybugsTest {


    private HappyLadybugs SUT;

    @BeforeEach
    public void setUp() throws Exception {
        SUT = new HappyLadybugs();
    }

    @Test
    public void map_testCase1() throws Exception {
        int[] results = SUT.map("ABABABC_");
        assertThat(results, is(new int[] {0, 1, 0, 1, 0, 1, 2, 26}));
    }

    @Test
    public void sort_testCase1() throws Exception {
        int[] result = SUT.sort(new int[] {0, 1, 0, 1, 0, 1, 2, 26});
        assertThat(result, is(new int[] {0, 0, 0, 1, 1, 1, 2, 26}));
    }

    @Test
    public void happyLadybugs_testCase1() throws Exception {
        String result = SUT.happyLadybugs("ABABABC_");
        assertThat(result, is("NO"));
    }

    @Test
    public void happyLadybugs_testCase2() throws Exception {
        String result = SUT.happyLadybugs("ABABAB_");
        assertThat(result, is("YES"));
    }

    @Test
    public void happyLadybugs_testCase3() throws Exception {
        String result = SUT.happyLadybugs("RBY_YBR");
        assertThat(result, is("YES"));
    }

    @Test
    public void happyLadybugs_testCase4() throws Exception {
        String result = SUT.happyLadybugs("X_Y__X");
        assertThat(result, is("NO"));
    }

    @Test
    public void happyLadybugs_testCase5() throws Exception {
        String result = SUT.happyLadybugs("__");
        assertThat(result, is("YES"));
    }

    @Test
    public void happyLadybugs_testCase6() throws Exception {
        String result = SUT.happyLadybugs("B_RRBR");
        assertThat(result, is("YES"));
    }

    @Test
    public void happyLadybugs_testCase7() throws Exception {
        String result = SUT.happyLadybugs("BRRBR");
        assertThat(result, is("NO"));
    }

    @Test
    public void happyLadybugs_testCase8() throws Exception {
        String result = SUT.happyLadybugs("BBRR");
        assertThat(result, is("YES"));
    }
}