package com.serhatleventyavas;

public class FindTheMedian {

    int findMedian(int[] arr) {
        int[] sortedArray = sort(arr);
        int center = (sortedArray.length - 1) / 2;
        return sortedArray[center];
    }

    public int[] sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
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

}
