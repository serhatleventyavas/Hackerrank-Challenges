package com.serhatleventyavas;

public class HalloweenSale {

    public int howManyGames(int p, int d, int m, int s) {
        int howManyGames = 0;
        int totalPrice = 0;


        while (s > totalPrice) {


            if (totalPrice == 0) {
                totalPrice = totalPrice + p;
            } else {
                if (p - d >= m) {
                    p = p - d;
                    totalPrice = totalPrice + p;
                } else {
                    totalPrice = totalPrice + m;
                }
            }

            if (s >= totalPrice)
                howManyGames = howManyGames + 1;

        }


        return howManyGames;
    }
}