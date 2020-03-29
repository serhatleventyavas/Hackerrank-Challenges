package com.serhatleventyavas;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class BetweenTwoSets {

    public int getTotalX(int[] a, int[] b) {

        int total = 0;
        Queue<Integer> queue = new ArrayDeque<>();

        int lowerNumberFromB = 101;
        int biggerNumberFromA = 0;

        for (int number : a) {
            if (biggerNumberFromA < number) {
                biggerNumberFromA = number;
            }
        }

        for (int number : b) {
            if (lowerNumberFromB > number) {
                lowerNumberFromB = number;
            }
        }

        for (int i = biggerNumberFromA; i <= lowerNumberFromB; i++) {
            boolean isCommonFactor = true;
            for (int number : a) {
                if (i % number != 0) {
                    isCommonFactor = false;
                    break;
                }
            }
            if (isCommonFactor)
                queue.add(i);
        }

        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            int factor = queue.remove();
            boolean isCommonFactor = true;

            for (int number: b) {
                if (number % factor != 0) {
                    isCommonFactor = false;
                    break;
                }
            }

            if (isCommonFactor) {
                total = total + 1;
                stack.push(factor);
            }
        }

        return total;
    }
}
