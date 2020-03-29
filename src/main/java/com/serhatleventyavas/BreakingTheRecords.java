package com.serhatleventyavas;

public class BreakingTheRecords {

    public int[] breakingRecords(int[] scores) {
        int min = 0;
        int max = 0;
        int worst = 0;
        int best = 0;

        max = scores[0];
        min = scores[0];

        for (int i = 1; i < scores.length; i++) {
            int score = scores[i];
            if (max < score) {
                max = score;
                best = best + 1;
            }

            if (min > score) {
                min = score;
                worst = worst + 1;
            }
        }
        int[] result = new int[2];
        result[0] = best;
        result[1] = worst;
        return result;
    }
}
