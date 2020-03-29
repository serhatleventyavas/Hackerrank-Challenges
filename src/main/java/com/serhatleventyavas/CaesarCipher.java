package com.serhatleventyavas;

public class CaesarCipher {

    public String caesarCipher(String s, int k) {
        String[] smallAlphabets = new String[] {"a","b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r","s","t", "u", "v", "w", "x", "y", "z"};
        String[] bigAlphabets = new String[] {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

        String cipher = "";

        char[] characters = s.toCharArray();

        for (char c: characters) {
            String[] alphabets = null;
            int index = -1;
            if (Character.isUpperCase(c)) {
                alphabets = bigAlphabets;
                index = getIndex(bigAlphabets, c);
            } else {
                alphabets = smallAlphabets;
                index = getIndex(smallAlphabets, c);
            }

            if (index == -1 && String.valueOf(c).equalsIgnoreCase("-")) {
                cipher = cipher + "-";
            } else if (index == -1 && String.valueOf(c).equalsIgnoreCase("'")) {
                cipher = cipher + "'";
            } else if (index == -1) {
                cipher = cipher + String.valueOf(c);
            } else {

                int newIndex = (index + k) % alphabets.length;
                cipher = cipher + alphabets[newIndex];
            }
        }

        return cipher;
    }

    private int getIndex(String[] alphabets, char currentLetter) {
        int index = -1;
        for (String letter: alphabets) {
            index = index + 1;
            if (letter.charAt(0) == currentLetter) {
                return index;
            }
        }
        return -1;
    }
}
