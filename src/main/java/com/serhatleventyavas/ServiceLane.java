package com.serhatleventyavas;

public class ServiceLane {

    public int[] serviceLane(int[] width, int n, int[][] cases) {

        int[] results = new int[cases.length];

        for (int i = 0; i < cases.length; i++) {

            int[] testCase = cases[i];

            int entryPoint = testCase[0];
            int exitPoint  = testCase[1];

            int result = Integer.MAX_VALUE;
            for (int j = entryPoint; j <= exitPoint; j++) {
                if (result > width[j]) {
                    result = width[j];
                }
            }

            results[i] = result;

        }

        return results;
    }
}
