package com.serhatleventyavas;

import java.util.HashMap;

public class Gemstones {

    private boolean[] initialArray(int length) {
        boolean[] arr = new boolean[length];
        for (int i = 0; i < length; i++) {
            arr[i] = false;
        }
        return arr;
    }

    private boolean hasExistsAllOfThem(boolean[] arr) {
        for (boolean val: arr) {
            if (!val)
                return false;
        }
        return true;
    }

    public int gemstones(String[] arr) {

        HashMap<String, boolean[]> hashMap = new HashMap<>();

        int gemstonesCount = 0;
        int index = -1;


        for (String input: arr) {
            index += 1;

            for (int i = 0; i < input.length(); i++) {
                String character = input.substring(i, i + 1);
                boolean[] value = hashMap.getOrDefault(character, initialArray(arr.length));
                value[index] = true;
                hashMap.put(character, value);
            }

        }

        for (String key: hashMap.keySet()) {
            boolean[] value = hashMap.getOrDefault(key, initialArray(arr.length));
            boolean hasExistsAllOfThem = hasExistsAllOfThem(value);
            if (hasExistsAllOfThem)
                gemstonesCount += 1;
        }

        return gemstonesCount;
    }
}
