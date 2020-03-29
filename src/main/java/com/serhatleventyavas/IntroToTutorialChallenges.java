package com.serhatleventyavas;

public class IntroToTutorialChallenges {
    public int introTutorial(int value, int[] arr) {
        for (int index = 0; index < arr.length;  index++) {
            if (arr[index] == value)
                return index;
        }
        return -1;
    }
}
