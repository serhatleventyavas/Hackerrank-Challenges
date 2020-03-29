package com.serhatleventyavas;

public class SimpleArraySum {
    public int simpleArraySum(int[] arr) {
        int total = 0;
        for (int number: arr) {
            total = total + number;
        }
        return total;
    }
}
