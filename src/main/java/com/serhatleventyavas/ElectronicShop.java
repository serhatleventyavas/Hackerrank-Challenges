package com.serhatleventyavas;

public class ElectronicShop {

    public int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int maxTotalPrice = -1;

        for (int keyboardPrice: keyboards) {
            for (int drive: drives) {
                if ((keyboardPrice + drive) <= b) {
                    if ((keyboardPrice + drive) > maxTotalPrice) {
                        maxTotalPrice = (keyboardPrice + drive);
                    }
                }
            }
        }
        return maxTotalPrice;
    }
}
