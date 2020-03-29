package com.serhatleventyavas;

public class FlatlandSpaceStations {

    public int flatlandSpaceStations(int numberOfCities, int[] citiesWithSpaceStations) {
        int[] nearestDistances = new int[numberOfCities];

        int maximumDistance = 0;
        for (int i = 0; i < numberOfCities; i++) {
            int minimumDistance = Integer.MAX_VALUE;
            for (int j = 0; j < citiesWithSpaceStations.length; j++) {

                int cityOne = i;
                int cityTwo = citiesWithSpaceStations[j];

                int distance = cityTwo - cityOne;

                if (!isPositive(distance)) {
                    distance = distance * (-1);
                }
                if (distance < minimumDistance) {
                    minimumDistance = distance;
                }
            }
            nearestDistances[i] = minimumDistance;
        }

        for (int distance: nearestDistances) {
            if (distance > maximumDistance) {
                maximumDistance = distance;
            }

        }
        return maximumDistance;
    }

    public boolean isPositive(int value) {
        return value > 0;
    }
}
