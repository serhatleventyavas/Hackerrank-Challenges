package com.serhatleventyavas;

public class ViralAdvertising {

    public int viralAdvertising(int n) {
        int countCumulativePeople = 0;
        int people = 5;

        for (int i = 1; i <= n; i++) {

            int likedPeople = people / 2;
            countCumulativePeople = countCumulativePeople + likedPeople;
            people = likedPeople * 3;
        }

        return countCumulativePeople;
    }
}
