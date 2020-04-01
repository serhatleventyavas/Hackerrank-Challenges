package com.serhatleventyavas;

import java.util.Stack;

public class AlternatingCharacters {

    public int alternatingCharacters(String input) {
        Stack<String> stack = new Stack<String>();

        int deletionCount = 0;
        for (int index = 0; index < input.length(); index++) {
            String character = input.substring(index, index + 1);
            if (stack.isEmpty()) {
                stack.push(character);
            } else {

                String lastCharacter = stack.peek();
                if (lastCharacter.equalsIgnoreCase(character)) {
                    deletionCount += 1;
                } else {
                    stack.push(character);
                }

            }
        }

        return deletionCount;
    }
}
