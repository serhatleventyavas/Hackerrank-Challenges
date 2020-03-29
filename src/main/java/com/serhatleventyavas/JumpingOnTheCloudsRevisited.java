package com.serhatleventyavas;

public class JumpingOnTheCloudsRevisited {

    public int jumpingOnClouds(int[] c, int k) {
        int energy = 100;
        int index = 0;
        boolean isFinish = false;
        while (!isFinish) {
            int newIndex = calculate(index, k, c.length);
            if (c[newIndex] == 1) {
                energy = energy - 2 - 1;
            } else {
                energy = energy - 1;
            }
            index = newIndex;
            if (index == 0)
                isFinish = true;
        }
        return energy;
    }

    private int calculate(int index, int k, int length) {
        return (index + k) % length;
    }

}
