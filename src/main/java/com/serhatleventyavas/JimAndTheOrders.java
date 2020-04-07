package com.serhatleventyavas;

public class JimAndTheOrders {

    public int[] jimOrders(int[][] orders) {
        Pair<Integer, Integer>[] deliveredTimeArray = new Pair[orders.length];

        int index = 0;
        for (int[] order: orders) {
            int deliveredTime = order[0] + order[1];
            deliveredTimeArray[index] = new Pair<>(index + 1, deliveredTime);
            index += 1;
        }

        deliveredTimeArray = sort(deliveredTimeArray);

        int[] result = new int[deliveredTimeArray.length];
        int secondIndex = 0;
        for (Pair<Integer, Integer> deliveredTime: deliveredTimeArray) {
            result[secondIndex] = deliveredTime.getFirst();
            secondIndex += 1;
        }
        return result;
    }

    public Pair<Integer, Integer>[] sort(Pair<Integer, Integer>[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            Pair<Integer, Integer> key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].getSecond() > key.getSecond()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
        return arr;
    }


}
