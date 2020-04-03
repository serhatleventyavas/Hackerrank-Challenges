package com.serhatleventyavas;

public class MarcsCakeWalk {

    long marcsCakewalk(int[] calories) {
        int[] sortedCalories = sort(calories);

        long totalDistance = 0;

        int index = sortedCalories.length;
        for (int calorie: sortedCalories) {
            index -= 1;
            double result = Math.pow(2, index) * calorie;

            totalDistance += result;
        }
        return totalDistance;
    }

    public int[] sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }

        return arr;
    }

}
