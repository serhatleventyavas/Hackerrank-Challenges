package com.serhatleventyavas;

public class CircularArrayNotation {

    public int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int root = k % a.length;
        int[] resultArray = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int query = queries[i];
            int result = 0;
            if (query - root >= 0)
                result = (a[query - root]);
            else
                result = (a[query - root + a.length]);

            resultArray[i] = result;
        }

        return resultArray;
    }
}
