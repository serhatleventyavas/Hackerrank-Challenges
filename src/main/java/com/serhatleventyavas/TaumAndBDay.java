package com.serhatleventyavas;

public class TaumAndBDay {
    public long calculateCosts(int blackGifts, int whiteGifts, int costOfBlackGifts, int costOfWhiteGifts, int convertCost) {
        long priceBlack = Math.min(costOfBlackGifts, costOfWhiteGifts + convertCost);
        long priceWhite = Math.min(costOfWhiteGifts, costOfBlackGifts + convertCost);
        return (blackGifts * priceBlack) + (whiteGifts * priceWhite);
    }
}
