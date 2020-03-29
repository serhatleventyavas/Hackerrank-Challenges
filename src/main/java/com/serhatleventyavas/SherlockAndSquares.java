package com.serhatleventyavas;

public class SherlockAndSquares {
    public int squares(int a, int b) {
        int count = 0;

        int lower = (int) Math.floor(Math.sqrt(a));
        int upper = (int) Math.floor(Math.sqrt(b));

        if (((upper * upper) != a) && ((lower * lower) != b)) {
            if (upper == lower)
                return 0;
            else
                count = upper - lower - 1;
        } else {
            count = upper - lower;
        }


        return count;
    }
}
