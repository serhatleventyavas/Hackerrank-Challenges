package com.serhatleventyavas;

import java.util.*;

public class ManasaAndStones {

    public int[] stones(int n, int a, int b) {
        SortedSet<Integer> setResult = new TreeSet<>();

        int index = n - 1;
        for (int i = 0; i < n; i++)  {
            int total = 0;
            int repeat = index - i;

            for (int j = 0; j < repeat; j++)  {
                total = total + a;
            }

            for (int k = 0; k < i; k++)  {
                total = total + b;
            }
            setResult.add(total);
        }
        int[] result = new int[setResult.size()];
        int arrayIndex = 0;
        for (Iterator<Integer> it = setResult.iterator(); it.hasNext(); ) {
            int value = it.next();
            result[arrayIndex] = value;
            arrayIndex = arrayIndex + 1;
        }
        return result;
    }
}
