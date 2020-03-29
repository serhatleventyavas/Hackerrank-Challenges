package com.serhatleventyavas;

public class MarsExploration {

    public int marsExploration(String s) {
        int changedLetterCount = 0;

        char[] letters = s.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (((i % 3) % 2) == 0) {
                if (!String.valueOf(letters[i]).equalsIgnoreCase("S")) {
                    changedLetterCount = changedLetterCount + 1;
                }
            } else {
                if (!String.valueOf(letters[i]).equalsIgnoreCase("O")) {
                    changedLetterCount = changedLetterCount + 1;
                }
            }
        }
        return changedLetterCount;
    }
}
