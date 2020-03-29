package com.serhatleventyavas;

public class MinimumDistances {

    public int minimumDistances(int[] a) {
        int min = -1;
        for (int i = 0; i < a.length; i++) {

            int loc1 = a[i];

            for (int j = i + 1; j < a.length; j++) {
                int loc2 = a[j];
                if (loc1 == loc2) {
                    if (min == -1) {
                        min = j - i;
                    } else {
                        if (min > (j - i))
                            min = j - i;
                    }
                }
            }
        }
        return min;
    }
}
