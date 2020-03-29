package com.serhatleventyavas;

import java.util.regex.Pattern;

public class Pangrams {

    public String pangrams(String s) {
        String[] alphabet = {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
        };

        if (s.split(Pattern.quote(" ")).length <= 1) {
            return "not pangram";
        }

        s = s.trim();
        char[] characters = s.toLowerCase().toCharArray();
        for (String letter: alphabet) {
            if (!s.contains(letter) && !s.contains(letter.toUpperCase())) {
                return "not_pangram";
            }
        }
        return "pangram";
    }
}
