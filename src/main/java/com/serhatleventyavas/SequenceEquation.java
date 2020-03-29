package com.serhatleventyavas;

import java.util.ArrayList;
import java.util.Arrays;

public class SequenceEquation {

    public int[] permutationEquation(int[] p) {
        int result[] = Arrays.copyOf(p, p.length);
        result = sort(result);
        ArrayList<Integer> yArray = new ArrayList<>();
        int[] yArray2 = new int[p.length];

        for (int i : result) {
            int index = 1;
            for (int j: p) {
                if (i == j) {
                    yArray.add(index);
                }
                index = index + 1;
            }
        }

        int position = 0;
        for (int i : yArray) {
            int index = 1;
            for (int j: p) {
                if (i == j) {
                    yArray2[position] = index;
                    position = position + 1;
                }
                index = index + 1;
            }
        }

        return yArray2;
    }

    private int[] sort(int[] list) {
        int temp;
        for (int i = 1; i < list.length; i++) {
            for (int j = i; j > 0; j--) {
                if (list[j] < list [j - 1]) {
                    temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                }
            }
        }

        return list;
    }
}
