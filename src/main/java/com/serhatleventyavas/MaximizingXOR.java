package com.serhatleventyavas;

public class MaximizingXOR {
    public int maximizingXor(int input1, int input2) {
        int maxValue = Integer.MIN_VALUE;

        for (int index1 = input1; index1 <= input2; index1++) {
            for (int index2 = input1; index2 <= input2; index2++) {
                int result = diffXor(index1, index2);
                if (result > maxValue) {
                    maxValue = result;
                }
            }
        }
        return maxValue;
    }

    private int diffXor(int input1, int input2) {
        StringBuilder bitResult1 = new StringBuilder(convert(input1));
        StringBuilder bitResult2 = new StringBuilder(convert(input2));

        int lengthOfDiff = bitResult1.length() - bitResult2.length();

        if (lengthOfDiff != 0) {
            if (lengthOfDiff < 0)
                lengthOfDiff = lengthOfDiff * -1;

            if (bitResult1.length() > bitResult2.length()) {
                for (int index = 0; index < lengthOfDiff; index ++) {
                    bitResult2.insert(0, "0");
                }
            } else {
                for (int index = 0; index < lengthOfDiff; index ++) {
                    bitResult1.insert(0, "0");
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for (int index1 = 0; index1 < bitResult1.length(); index1++) {
            String character1 = bitResult1.substring(index1, index1 + 1);
            String character2 = bitResult2.substring(index1, index1 + 1);

            if (character1.equalsIgnoreCase(character2)) {
                result.append("0");
            } else {
                result.append("1");
            }
        }

        int response = 0;

        result = result.reverse();
        for (int index = 0; index < result.length(); index++) {
            String character = result.substring(index, index + 1);
            int number = Integer.parseInt(character);
            if (number == 1) {
                int powResult = (int) Math.pow(2, index);
                response += powResult;
            }
        }

        return response;
    }

    private String convert(int input) {
        StringBuilder result = new StringBuilder();

        while (input > 0) {
            result.append(( (input % 2 ) == 0 ? "0" : "1"));
            input = input / 2;
        }
        return result.reverse().toString();
    }
}
