package com.serhatleventyavas;

public class CountingSort2 {

    public int[] countingSortAndPrint(int[] arr) {
        int biggestNumber = Integer.MIN_VALUE;

        for (int number : arr) {
            if (number > biggestNumber) {
                biggestNumber = number;
            }
        }

        int[] occurrencesNumbers = new int[biggestNumber + 1];

        for (int number: arr) {
            int value = occurrencesNumbers[number];
            occurrencesNumbers[number] = value + 1;
        }

        int index = -1;
        int sortIndex = -1;
        int[] resultSort = new int[arr.length];
        for (int totalOccurrences: occurrencesNumbers) {
            index += 1;
            for (int count = 0; count < totalOccurrences; count++) {
                sortIndex += 1;
                resultSort[sortIndex] = index;
            }
        }

        return resultSort;
    }

}
