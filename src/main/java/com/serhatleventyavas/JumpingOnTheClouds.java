package com.serhatleventyavas;

public class JumpingOnTheClouds {

    public int jumpingOnClouds(int[] c) {
        int takeStep = 0;
        int index = 0;

        int lastPosition = c.length - 1;

        boolean isFinish = false;
        while (!isFinish) {
            if (index >= lastPosition) {
                    isFinish = true;
            } else if (index + 1 == lastPosition) {
                if (c[lastPosition] != 1) {
                    takeStep = takeStep + 1;
                }
                index = index + 1;
            } else {
                if (c[index + 2] != 1) {
                    takeStep = takeStep + 1;
                    index = index + 2;
                } else {
                    takeStep = takeStep + 1;
                    index = index + 1;
                }
            }
        }
        return takeStep;
    }
}