package com.serhatleventyavas;

import java.util.Stack;

public class SuperReducedString {
    public String superReducedString(String value) {
        Stack<String> stack = new Stack<String>();

        for (int index = 0; index < value.length(); index++) {
            if (stack.isEmpty()) {
                stack.push(value.substring(index, index + 1));
            } else {
                String popValue = stack.pop();
                String indexValue = value.substring(index, index + 1);
                if (!popValue.equalsIgnoreCase(indexValue)) {
                    stack.push(popValue);
                    stack.push(indexValue);
                }
            }
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        if (result.length() == 0) {
            return "Empty String";
        }
        return result.reverse().toString();
    }
}
