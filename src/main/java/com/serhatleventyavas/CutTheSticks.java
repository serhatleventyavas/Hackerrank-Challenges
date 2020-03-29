package com.serhatleventyavas;

import java.util.ArrayDeque;
import java.util.Queue;

public class CutTheSticks {
    public int[] cutTheSticks(int[] arr) {
        Queue<Integer> queue = new ArrayDeque<>();
        boolean isResuming = true;

        while (isResuming) {
            // en kücük cubugu bul
            int minStick = Integer.MAX_VALUE;
            for (int item: arr) {
                if (item > 0) {
                    if (minStick > item) {
                        minStick = item;
                    }
                }
            }
            int task = 0;
            for (int i = 0; i < arr.length; i++) {
                int item = arr[i];
                if (item > 0) {
                    arr[i] = item - minStick;
                    task = task + 1;
                }
            }
            if (task > 0)
                queue.add(task);
            if (task == 0 || task == 1) {
                isResuming = false;
            }
        }

        int position = 0;
        int[] processCount = new int[queue.size()];
        while (!queue.isEmpty()) {
            processCount[position] = queue.remove();
            position = position + 1;
        }
        return processCount;
    }
}
