package com.serhatleventyavas;

import java.util.HashMap;

public class GridChallenge {

    private int getWeight(String letter) {
        HashMap<String, Integer> alphabet = new HashMap<>();
        alphabet.put("a", 1);
        alphabet.put("b", 2);
        alphabet.put("c", 3);
        alphabet.put("d", 4);
        alphabet.put("e", 5);
        alphabet.put("f", 6);
        alphabet.put("g", 7);
        alphabet.put("h", 8);
        alphabet.put("i", 9);
        alphabet.put("j", 10);
        alphabet.put("k", 11);
        alphabet.put("l", 12);
        alphabet.put("m", 13);
        alphabet.put("n", 14);
        alphabet.put("o", 15);
        alphabet.put("p", 16);
        alphabet.put("q", 17);
        alphabet.put("r", 18);
        alphabet.put("s", 19);
        alphabet.put("t", 20);
        alphabet.put("u", 21);
        alphabet.put("v", 22);
        alphabet.put("w", 23);
        alphabet.put("x", 24);
        alphabet.put("y", 25);
        alphabet.put("z", 26);

        return alphabet.getOrDefault(letter, 0);
    }

    private int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }

            arr[j + 1] = key;
        }
        return arr;
    }

    public String gridChallenge(String[] grid) {
        int[][] matrix = new int[grid.length][grid[0].length()];
        int[][] reverseMatrix = new int[grid[0].length()][grid.length];

        int index = 0;
        for (String word: grid) {

            for (int i = 0; i < word.length(); i++) {
                String letter = word.substring(i, i + 1);
                matrix[index][i] = getWeight(letter);
            }

            matrix[index] = sort(matrix[index]);
            index += 1;
        }

        boolean hasGrid = true;

        for (int rowIndex = 0; rowIndex < matrix.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++) {
                reverseMatrix[columnIndex][rowIndex] = matrix[rowIndex][columnIndex];
            }
        }

        for (int rowIndex = 0; rowIndex < reverseMatrix.length; rowIndex++) {
            for (int columnIndex = 1; columnIndex < reverseMatrix[rowIndex].length; columnIndex++) {
                int prev = reverseMatrix[rowIndex][columnIndex - 1];
                int current = reverseMatrix[rowIndex][columnIndex];
                if (prev > current) {
                    hasGrid = false;
                    break;
                }
            }
        }
        return hasGrid ? "YES" : "NO";
    }
}
