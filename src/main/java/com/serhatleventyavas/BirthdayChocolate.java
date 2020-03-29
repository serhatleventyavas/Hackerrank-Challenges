package com.serhatleventyavas;

public class BirthdayChocolate {

    public int birthday(int[] s, int d, int m) {
        int count = 0;

        for (int i = 0; i < s.length; i++) {
            if ((i + m) <= s.length) {
                int sumResult = 0;
                for (int k = 0; k < m; k++) {
                    sumResult = sumResult + s[i + k];
                }
                if (d == sumResult) {
                    count = count + 1;
                }
            }
        }

        return count;
    }

}
