package com.serhatleventyavas;

public class TwoCatsAndOneMouse {

    public String catAndMouse(int x, int y, int z) {
        int distanceFromCatAToMouse = x - z;
        int distanceFromCatBToMouse = y - z;

        if (distanceFromCatAToMouse == distanceFromCatBToMouse || (-1 * distanceFromCatAToMouse) == distanceFromCatBToMouse) {
            return "Mouse C";
        } else {
            if (distanceFromCatAToMouse < 0) {
                distanceFromCatAToMouse = distanceFromCatAToMouse * (-1);
            }

            if (distanceFromCatBToMouse < 0) {
                distanceFromCatBToMouse = distanceFromCatBToMouse * (-1);
            }

            if (distanceFromCatAToMouse > distanceFromCatBToMouse) {
                return "Cat B";
            } else {
                return "Cat A";
            }
        }
    }
}