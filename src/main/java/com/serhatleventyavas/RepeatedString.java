package com.serhatleventyavas;

public class RepeatedString {

    public long repeatedString(String s, long n) {
        String repeatedCharacter = "a";

        if (s.length() == 1 && s.equalsIgnoreCase(repeatedCharacter)) {
            return n;
        } else if (s.length() == 1) {
            return 0;
        }

        int repeatedCharacterCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equalsIgnoreCase(repeatedCharacter)) {
                repeatedCharacterCount = repeatedCharacterCount + 1;
            }
        }

        long kalan = n % s.length();
        long bolum = n / s.length();


        long count = 0;
        count = (bolum * repeatedCharacterCount);

        for (int i = 0; i < kalan; i++) {
            if (String.valueOf(s.charAt(i)).equalsIgnoreCase(repeatedCharacter)) {
                count = count + 1;
            }
        }

        return count;
    }
}
