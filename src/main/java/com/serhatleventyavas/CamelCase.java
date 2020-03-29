package com.serhatleventyavas;

public class CamelCase {

    public int camelcase(String s) {
        int wordCount = 0;

        char[] letters = s.toCharArray();

        for (char letter: letters) {
            if (Character.isUpperCase(letter)) {
                wordCount = wordCount + 1;
            }
        }

        return wordCount;
    }
}
