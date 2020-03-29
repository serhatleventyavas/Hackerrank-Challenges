package com.serhatleventyavas;

public class DesignerPdfViewer {

    public int designerPdfViewer(int[] h, String word) {
        String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        char[] lettersOfWord = word.toCharArray();

        int height = h[0];
        for (char letterOfWord: lettersOfWord) {
            for (int i = 0; i < letters.length; i++) {
                if (String.valueOf(letterOfWord).equalsIgnoreCase(letters[i])) {
                    if (height < h[i]) {
                        height = h[i];
                    }
                }
            }
        }
        return lettersOfWord.length * height;
    }
}
