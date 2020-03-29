package com.serhatleventyavas;

public class BirthdayCakeCandles {

    public int birthdayCakeCandles(int[] array) {
        int count = 0;
        int max = Integer.MIN_VALUE;

        for (int number: array)  {
            if (number > max) {
                max = number;
                count = 1;
            } else if (number == max) {
                count = count + 1;
            }
        }
        return count;
    }
}
