package com.serhatleventyavas;

import java.util.HashMap;
import java.util.Iterator;

public class LonelyInteger {

    public int lonelyinteger(int[] input) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int value: input) {
            int count = hashMap.getOrDefault(value, 0);
            hashMap.put(value, count + 1);
        }

        for (Iterator<Integer> it = hashMap.keySet().iterator(); it.hasNext(); ) {
            int key = it.next();
            int value = hashMap.getOrDefault(key, 0);
            if (value == 1)
                return key;
        }
        return -1;
    }
}
