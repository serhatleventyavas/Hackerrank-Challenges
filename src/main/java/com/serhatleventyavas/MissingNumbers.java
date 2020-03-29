package com.serhatleventyavas;

import java.util.*;

public class MissingNumbers {

    int[] missingNumbers(int[] arr, int[] brr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int a: brr) {
            hashMap.put(a, hashMap.getOrDefault(a, 0) + 1);
        }

        for (int b: arr) {
            hashMap.put(b, hashMap.getOrDefault(b, 0) - 1);
        }

        Stack<Integer> stacks = new Stack<>();

        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            int key = (int) pair.getKey();
            int value = (int) pair.getValue();
            if (value > 0) {
                stacks.push(key);
            }
        }

        int[] cache = new int[stacks.size()];
        for (int i = stacks.size() - 1; i >= 0; i--) {
            cache[i] = stacks.pop();
        }
        return cache;
    }

}
