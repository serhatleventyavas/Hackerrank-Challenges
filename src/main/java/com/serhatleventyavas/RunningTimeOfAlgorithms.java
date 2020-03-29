package com.serhatleventyavas;

public class RunningTimeOfAlgorithms {

    public int runningTime(int[] arr) {
        int shiftCount = 0;

        int key = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                shiftCount = shiftCount + 1;
            }
            arr[j + 1] = key;
        }

        return shiftCount;
    }
}
