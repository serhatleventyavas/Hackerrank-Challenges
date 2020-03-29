package com.serhatleventyavas;

public class AcmIcpcTeam {

    public int[] acmTeam(String[] list) {

        int maxTopic = 0;
        int teamCount = 0;

        for (int i = 0; i < list.length; i++) {

            char[] xTopic = list[i].toCharArray();

            for (int j = i; j  < list.length; j++) {
                char[] yTopic = list[j].toCharArray();

                int topic = 0;
                if (i != j) {
                    for (int k = 0; k < yTopic.length; k++) {
                        if (Integer.parseInt(String.valueOf(yTopic[k])) == 1 ||
                        Integer.parseInt(String.valueOf(xTopic[k])) == 1) {
                            topic = topic + 1;
                        }
                    }
                    if (topic > maxTopic) {
                        maxTopic = topic;
                        teamCount = 1;
                    } else if (topic == maxTopic) {
                        teamCount = teamCount + 1;
                    }
                }

            }

        }

        return new int[] {maxTopic, teamCount};
    }
}
