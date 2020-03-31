package com.serhatleventyavas;

import java.util.ArrayDeque;
import java.util.Queue;

public class HackerRankInAString {

    public String hackerrankInString(String input) {
        ArrayDeque<String> queue = getHackerRankQueue();

        for (int index = 0; index < input.length(); index++) {
            String character = input.substring(index, index + 1);

            if (queue.isEmpty())
                break;

            String firstCharacterOfQueue = queue.getFirst();
            if (character.equalsIgnoreCase(firstCharacterOfQueue)) {
                queue.remove();
            }
        }

        if (queue.isEmpty()) {
            return "YES";
        }
        return "NO";
    }

    private ArrayDeque<String> getHackerRankQueue() {
        ArrayDeque<String> hackerRankQueue = new ArrayDeque<>();
        hackerRankQueue.add("h");
        hackerRankQueue.add("a");
        hackerRankQueue.add("c");
        hackerRankQueue.add("k");
        hackerRankQueue.add("e");
        hackerRankQueue.add("r");
        hackerRankQueue.add("r");
        hackerRankQueue.add("a");
        hackerRankQueue.add("n");
        hackerRankQueue.add("k");
        return hackerRankQueue;
    }
}
