package com.serhatleventyavas;

public class SumVsXor {
    public long sumXor(long number) {
        long counter = 0;


        while(number != 0) {
            if(number % 2 == 0) counter++;
            number = number / 2;
        }
        return (long)Math.pow(2, counter);
    }
}
