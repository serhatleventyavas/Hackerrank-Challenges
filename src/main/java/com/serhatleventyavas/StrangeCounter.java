package com.serhatleventyavas;

public class StrangeCounter {

    public long strangeCounter(long t) {
        int expValue = 0;

        boolean isDone = true;

        long total = 0;

        while (isDone) {
            long powValue = (long) Math.pow(2, expValue);
            total = total + (3 * powValue);
            if (total >= t) {
                isDone = false;
            } else {
                expValue = expValue + 1;
            }
        }

        long diff = t - total;
        return 1 - diff;
    }
}