package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class MakingAnagramsTest {

    private MakingAnagrams SUT;

    @BeforeEach
    public void setup() {
        SUT = new MakingAnagrams();
    }

    @Test
    public void makingAnagrams_testCase1() {
        int result = SUT.makingAnagrams("cde", "abc");
        assertThat(result, is(4));
    }

    @Test
    public void makingAnagrams_testCase2() {
        int result = SUT.makingAnagrams("abc", "amnop");
        assertThat(result, is(6));
    }

    @Test
    public void makingAnagrams_testCase3() {
        int result = SUT.makingAnagrams("absdjkvuahdakejfnfauhdsaavasdlkj", "djfladfhiawasdkjvalskufhafablsdkashlahdfa");
        assertThat(result, is(19));
    }
}