package com.serhatleventyavas;

public class AngryProfessor {

    public String angryProfessor(int k, int[] a) {
        int threshold = 0;

        for (int time: a) {
            if (time <= 0)
                threshold = threshold + 1;
        }

        if (threshold >= k) {
            return "NO";
        } else {
            return "YES";
        }
    }

}
