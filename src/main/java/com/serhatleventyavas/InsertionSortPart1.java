package com.serhatleventyavas;

public class InsertionSortPart1 {

    public String sort(int[] arr) {
        StringBuilder result = new StringBuilder();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;

                String line = printArray(arr);
                if (result.length() > 0) {
                    result.append("\n").append(line);
                } else {
                    result = new StringBuilder(line);
                }
            }

            arr[j + 1] = key;
        }
        String last = printArray(arr);
        result.append("\n").append(last);
        return result.toString();
    }

    private String printArray(int[] array) {
        StringBuilder line = new StringBuilder();
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            if (line.length() > 0) {
                line.append(", ").append(String.valueOf(array[i]));
            } else {
                line = new StringBuilder(String.valueOf(array[i]));
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return line.toString();
    }
}
