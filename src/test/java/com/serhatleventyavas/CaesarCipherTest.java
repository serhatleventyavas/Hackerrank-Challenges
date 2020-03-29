package com.serhatleventyavas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CaesarCipherTest {

    private CaesarCipher SUT;

    @BeforeEach
    public void setup() {
        SUT = new CaesarCipher();
    }

    @Test
    public void caesarCipher_testCase1() {
        String result = SUT.caesarCipher("middle-Outz", 2);
        assertThat(result, is("okffng-Qwvb"));
    }

    @Test
    public void caesarCipher_testCase2() {
        String result = SUT.caesarCipher("Always-Look-on-the-Bright-Side-of-Life", 5);
        assertThat(result, is("Fqbfdx-Qttp-ts-ymj-Gwnlmy-Xnij-tk-Qnkj"));
    }

    @Test
    public void caesarCipher_testCase3() {
        String result = SUT.caesarCipher("There's-a-starman-waiting-in-the-sky", 3);
        assertThat(result, is("Fqbfdx-Qttp-ts-ymj-Gwnlmy-Xnij-tk-Qnkj"));
    }
}