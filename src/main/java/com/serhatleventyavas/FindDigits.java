package com.serhatleventyavas;

public class FindDigits {

    public int findDigits(int n) {
        int count = 0;
        String numberText = String.valueOf(n);
        char[] numberCharacters = numberText.toCharArray();

        for (char character: numberCharacters) {
            int number = Integer.parseInt(String.valueOf(character));
            if (number > 0) {
                if (n % number == 0) {
                    count = count + 1;
                }
            }
        }
        return count;
    }
}
