package com.serhatleventyavas;

public class SmartNumber {

    public boolean isSmartNumber(int number) {
        int factors = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors = factors + 1;
            }
        }
        return (factors % 2 == 1);
    }
}
