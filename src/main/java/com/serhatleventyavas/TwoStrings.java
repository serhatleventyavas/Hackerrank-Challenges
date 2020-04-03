package com.serhatleventyavas;

import java.util.HashMap;

public class TwoStrings {

    public String twoStrings(String s1, String s2) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int index = 0; index < s1.length(); index++) {
            String character = s1.substring(index, index + 1);
            int count = hashMap.getOrDefault(character, 0);
            hashMap.put(character, ++count);
        }

        for (int index = 0; index < s2.length(); index++) {
            String character = s2.substring(index, index + 1);
            int count = hashMap.getOrDefault(character, 0);
            if (count > 0) {
                return "YES";
            }
        }
        return "NO";
    }
}
