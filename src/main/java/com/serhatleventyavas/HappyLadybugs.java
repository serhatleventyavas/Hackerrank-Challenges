package com.serhatleventyavas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HappyLadybugs {

    private final int A = 0;
    private final int B = 1;
    private final int C = 2;
    private final int D = 3;
    private final int E = 4;
    private final int F = 5;
    private final int G = 6;
    private final int H = 7;
    private final int I = 8;
    private final int J = 9;
    private final int K = 10;
    private final int L = 11;
    private final int M = 12;
    private final int N = 13;
    private final int O = 14;
    private final int P = 15;
    private final int Q = 16;
    private final int R = 17;
    private final int S = 18;
    private final int T = 19;
    private final int U = 20;
    private final int V = 21;
    private final int W = 22;
    private final int X = 23;
    private final int Y = 24;
    private final int Z = 25;
    private final int UNDERSCORE = 26;

    public String happyLadybugs(String b) {
        int[] unSortedMaps = map(b);
        int[] maps = sort(map(b));

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int item: maps) {
            if (!hashMap.containsKey(item)) {
                hashMap.put(item, 1);
            } else {
                hashMap.put(item, hashMap.getOrDefault(item, 1) + 1);
            }
        }

        int countOfLetters = 0;

        for (int key: hashMap.keySet()) {
            int countOfLetter = hashMap.getOrDefault(key, 1);

            if (key != 26) {
                countOfLetters = countOfLetters + countOfLetter;
            }

            if (key != 26 && countOfLetter == 1) {
                return "NO";
            }
        }

        if (countOfLetters < b.length()) {
            return "YES";
        }

        int firstValue = unSortedMaps[0];
        int count = 1;
        int totalCount = hashMap.getOrDefault(firstValue, 2);

        for (int i = 1; i < unSortedMaps.length; i++) {
            int value = unSortedMaps[i];
            if (value == firstValue) {
                count = count + 1;
            } else {
                if (count == totalCount) {
                    // sıkıntı yok.
                    count = 1;
                    firstValue = value;
                } else {
                    return "NO";
                }
            }
        }

        return "YES";
    }


    public int[] sort(int[] values) {
        Arrays.sort(values);
        return values;
    }

    public int[] map(String value) {
        int[] numberValues = new int[value.length()];
        char[] letters = value.toCharArray();

        int index = 0;

        for (char letter : letters) {
            numberValues[index] = getNumberOfCharacter(String.valueOf(letter));
            index = index + 1;
        }

        return numberValues;
    }

    public int getNumberOfCharacter(String letter) {
        if (letter.equalsIgnoreCase("A")) {
            return A;
        } else if (letter.equalsIgnoreCase("B")) {
            return B;
        } else if (letter.equalsIgnoreCase("C")) {
            return C;
        } else if (letter.equalsIgnoreCase("D")) {
            return D;
        } else if (letter.equalsIgnoreCase("E")) {
            return E;
        } else if (letter.equalsIgnoreCase("F")) {
            return F;
        } else if (letter.equalsIgnoreCase("G")) {
            return G;
        } else if (letter.equalsIgnoreCase("H")) {
            return H;
        } else if (letter.equalsIgnoreCase("I")) {
            return I;
        } else if (letter.equalsIgnoreCase("J")) {
            return J;
        } else if (letter.equalsIgnoreCase("K")) {
            return K;
        } else if (letter.equalsIgnoreCase("L")) {
            return L;
        } else if (letter.equalsIgnoreCase("M")) {
            return M;
        } else if (letter.equalsIgnoreCase("N")) {
            return N;
        } else if (letter.equalsIgnoreCase("O")) {
            return O;
        } else if (letter.equalsIgnoreCase("P")) {
            return P;
        } else if (letter.equalsIgnoreCase("Q")) {
            return Q;
        } else if (letter.equalsIgnoreCase("R")) {
            return R;
        } else if (letter.equalsIgnoreCase("S")) {
            return S;
        } else if (letter.equalsIgnoreCase("T")) {
            return T;
        } else if (letter.equalsIgnoreCase("U")) {
            return U;
        } else if (letter.equalsIgnoreCase("V")) {
            return V;
        } else if (letter.equalsIgnoreCase("W")) {
            return W;
        } else if (letter.equalsIgnoreCase("X")) {
            return X;
        } else if (letter.equalsIgnoreCase("Y")) {
            return Y;
        } else if (letter.equalsIgnoreCase("Z")) {
            return Z;
        } else if (letter.equalsIgnoreCase("_")) {
            return UNDERSCORE;
        }
        return -1;
    }
}
