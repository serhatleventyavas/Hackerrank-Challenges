package com.serhatleventyavas;

import java.util.HashMap;
import java.util.Map;

public class MakingAnagrams {

    private String[] parseArray(String s) {
        String[] letters =  new String[s.length()];
        char[] characters = s.toCharArray();

        int index = 0;
        for (char c: characters) {
            letters[index] = String.valueOf(c);
            index = index + 1;
        }
        return letters;
    }

    public int makingAnagrams(String s1, String s2) {
        String[] lettersOfPart1 = parseArray(s1);
        String[] lettersOfPart2 = parseArray(s2);

        HashMap<String, Integer> hashMapOfPart1 = new HashMap<>();
        HashMap<String, Integer> hashMapOfPart2 = new HashMap<>();

        for (String letter: lettersOfPart1) {
            int value = hashMapOfPart1.getOrDefault(letter, 0);
            hashMapOfPart1.put(letter, value + 1);
        }

        for (String letter: lettersOfPart2) {
            int value = hashMapOfPart2.getOrDefault(letter, 0);
            hashMapOfPart2.put(letter, value + 1);
        }

        for(Map.Entry<String, Integer> entry : hashMapOfPart1.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (hashMapOfPart2.containsKey(key)) {
                int valueOfKey = hashMapOfPart2.getOrDefault(key, 0);
                int diff = valueOfKey - value;
                if (diff < 0) {
                    diff = diff * -1;
                }
                hashMapOfPart2.put(key, diff);
            } else {
                int valueOfKey = hashMapOfPart1.getOrDefault(key, 0);
                hashMapOfPart2.put(key, valueOfKey);
            }
        }

        int changedCount = 0;
        for(Map.Entry<String, Integer> entry : hashMapOfPart2.entrySet()) {
            Integer value = entry.getValue();
            changedCount = changedCount + value;
        }
        return  changedCount;
    }
}
