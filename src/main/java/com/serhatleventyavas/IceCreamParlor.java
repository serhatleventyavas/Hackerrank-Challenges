package com.serhatleventyavas;

public class IceCreamParlor {

    int[] icecreamParlor(int m, int[] arr) {
        int flavorIndex1 = -1;
        int flavorIndex2 = -1;
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            flavorIndex1 = i + 1;
            int number1 = arr[i];
            for (int j = (i + 1); j < arr.length; j++) {
                flavorIndex2 = j + 1;
                int number2 = arr[j];

                if ((number1 + number2) == m) {
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
                break;
            }
        }
        return new int[] { flavorIndex1, flavorIndex2 };
    }

}
