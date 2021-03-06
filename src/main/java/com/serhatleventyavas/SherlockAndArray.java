package com.serhatleventyavas;

import java.util.List;

public class SherlockAndArray {

    public String balancedSums(List<Integer> arr) {
        int x = 0;
        int sum = 0;

        for (int a: arr) {
            sum += a;
        }

        for (int y: arr) {
            if (2 * x == sum - y) {
                return "YES";
            }
            x = x + y;
        }
        return "NO";
    }
}
