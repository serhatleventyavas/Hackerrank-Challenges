package com.serhatleventyavas;

public class CountingSort1 {

    public int[] countingSort(int[] arr) {
        int biggestNumber = Integer.MIN_VALUE;

        for (int number : arr) {
            if (number > biggestNumber) {
                biggestNumber = number;
            }
        }

        System.out.println(biggestNumber);
        int[] occurrencesNumbers = new int[biggestNumber + 1];

        for (int number: arr) {
            int value = occurrencesNumbers[number];
            occurrencesNumbers[number] = value + 1;
        }

        return occurrencesNumbers;
    }
}
