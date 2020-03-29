package com.serhatleventyavas;

import java.util.List;

public class PickingNumbers {

    public int pickingNumbers(List<Integer> a) {
        int[] numbers = new int[99];

        for (int number: a) {
            numbers[number - 1] = numbers[number - 1] + 1;
        }

        int maxLength = 0;
        for (int i = 1; i < numbers.length; i++) {
            maxLength = Math.max(maxLength, numbers[i] + numbers[i - 1]);
        }

        return maxLength;
    }
}
