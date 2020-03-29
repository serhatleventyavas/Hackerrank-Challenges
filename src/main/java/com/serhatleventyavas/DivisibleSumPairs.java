package com.serhatleventyavas;

public class DivisibleSumPairs {

    public int divisibleSumPairs(int n, int k, int[] ar) {

        int count = 0;

        for (int i = 0; i < ar.length; i++) {
            for (int j = (i + 1); j < ar.length; j++) {
                int number1 = ar[i];
                int number2 = ar[j];
                if (i < j) {
                    int sumResult = number1 + number2;
                    if (sumResult % k == 0)
                        count = count + 1;
                }
            }
        }
        return count;
    }
}
