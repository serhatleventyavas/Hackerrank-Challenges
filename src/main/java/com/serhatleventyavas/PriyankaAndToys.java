package com.serhatleventyavas;

public class PriyankaAndToys {

    private int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public int toys(int[] w) {
        w = sort(w);
        int containerCount = 1;
        int minWeight = w[0];
        for (int i = 1; i < w.length; i++) {
            if ((w[i] - minWeight) > 4) {
                containerCount = containerCount + 1;
                minWeight = w[i];
            }
        }
        return containerCount;
    }
}
