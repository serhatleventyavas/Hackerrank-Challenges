package com.serhatleventyavas;

import java.util.List;

public class MigratoryBirds {
    public int migratoryBirds(List<Integer> arr) {
        int type = 0;

        int[] types = new int[] {0, 0, 0, 0, 0};

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == 1) {
                types[0] = types[0] + 1;
            } else if (arr.get(i) == 2) {
                types[1] = types[1] + 1;
            } else if (arr.get(i) == 3) {
                types[2] = types[2] + 1;
            } else if (arr.get(i) == 4) {
                types[3] = types[3] + 1;
            } else if (arr.get(i) == 5) {
                types[4] = types[4] + 1;
            }
        }

        int biggerBiggerType = types[0];
        type = 1;
        for (int i = 1; i < types.length; i++) {
            if (biggerBiggerType < types[i]) {
                biggerBiggerType = types[i];
                type = i + 1;
            }
        }
        return type;
    }
}
