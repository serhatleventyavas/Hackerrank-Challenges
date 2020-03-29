package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class KangarooTest {

    private Kangaroo SUT;

    @BeforeEach
    public void setup() {
        SUT = new Kangaroo();
    }

    @Test
    public void kangaroo_testeCase1() {
        String result = SUT.kangaroo(0, 3, 4, 2);
        assertThat(result, is("YES"));
    }
}