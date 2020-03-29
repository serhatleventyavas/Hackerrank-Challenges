package com.serhatleventyavas;

import java.util.HashMap;
import java.util.Set;

public class EqualizeTheArray {

    public int equalizeArray(int[] arr) {
        HashMap<Integer, Integer> maps = new HashMap<>();
        for (int number: arr) {
            if (maps.keySet().contains(number)) {
                int count = maps.get(number);
                maps.replace(number, count + 1);
            } else {
                maps.put(number, 1);
            }
        }

        Set<Integer> keySet = maps.keySet();

        int max = maps.get(keySet.iterator().next());
        for (int key: keySet) {
            if (maps.getOrDefault(key, 0) > max) {
                max = maps.get(key);
            }
        }

        return arr.length - max;
    }
}