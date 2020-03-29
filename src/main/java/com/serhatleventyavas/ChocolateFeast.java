package com.serhatleventyavas;

public class ChocolateFeast {

    public int chocolateFeast(int price, int costOfABar, int wrapper) {
        int totalBars = 0;
        int totalWrappers = 0;

        totalBars = price / costOfABar;

        totalWrappers = totalBars;


        while (totalWrappers > wrapper) {
            int availableBars = totalWrappers / wrapper;
            totalWrappers = totalWrappers - (availableBars * wrapper);
            totalWrappers  = totalWrappers + availableBars;
            totalBars = totalBars + availableBars;
        }
        return totalBars;
    }
}
