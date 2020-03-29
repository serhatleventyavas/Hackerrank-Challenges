package com.serhatleventyavas;

public class CountingValleys {

    public int countingValleys(int n, String s) {
        int seaLevel = 0;
        int valleyCount = 0;
        char[] stepArray = s.toCharArray();
        boolean isSeaLevel = true;

        for (char c : stepArray) {
            if (String.valueOf(c).equalsIgnoreCase("U")) {
                seaLevel = seaLevel + 1;
            } else if (String.valueOf(c).equalsIgnoreCase("D")) {
                seaLevel = seaLevel - 1;
            }
            if (isSeaLevel) {
                isSeaLevel = false;
                if (seaLevel < 0)
                    valleyCount = valleyCount + 1;

            } else {
                if (seaLevel >= 0) {
                    isSeaLevel = true;
                }
            }
        }
        return valleyCount;
    }
}
