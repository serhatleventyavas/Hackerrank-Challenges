package com.serhatleventyavas;

import java.util.HashMap;

public class ClosestNumbers {

    int[] closestNumbers(int[] arr) {
        int[] sortedArray = sort(arr);

        HashMap<Pair<Integer, Integer>, Integer> hashMap = new HashMap<>();

        for (int index = 1; index < sortedArray.length; index++) {
            int prevIndex = index - 1;
            int prevValue = sortedArray[prevIndex];
            int value = sortedArray[index];

            int diff = value - prevValue;
            hashMap.put(new Pair<Integer, Integer>(prevValue, value), diff);
        }

        int count = 0;
        int minDiff = Integer.MAX_VALUE;

        for (int value: hashMap.values()) {
            if (value < minDiff) {
                minDiff = value;
                count = 1;
            } else if (value == minDiff) {
                count += 1;
            }
        }

        int[] result = new int[count * 2];
        int index = 0;
        for (Pair<Integer, Integer> key: hashMap.keySet()) {
            int value = hashMap.get(key);
            if (minDiff == value) {
                result[index] = key.getFirst();
                result[index + 1] = key.getSecond();
                index += 2;
            }
        }
        return sort(result);
    }

    public int[] sort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
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
