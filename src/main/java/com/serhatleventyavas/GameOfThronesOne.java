package com.serhatleventyavas;

import java.util.HashMap;
import java.util.Set;

public class GameOfThronesOne {

    public String gameOfThrones(String s) {
        HashMap<String, Integer> maps = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            String character = String.valueOf(s.charAt(i));
            if (maps.containsKey(character)) {
                int count = maps.get(character);
                count = count + 1;
                maps.replace(character, count);
            } else {
                maps.put(character, 1);
            }
        }

        Set<String> keySet = maps.keySet();

        int oddCount = 0;

        for (String key: keySet) {
            if (maps.get(key) % 2 == 1) {
                oddCount = oddCount + 1;
            }
        }

        return (oddCount == 0 || oddCount == 1) ? "YES":"NO";
    }
}
