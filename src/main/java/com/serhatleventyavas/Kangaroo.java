package com.serhatleventyavas;

public class Kangaroo {

    public String kangaroo(int x1, int v1, int x2, int v2) {
        if (x1 < x2) {
            if (v1 <= v2) {
                return "NO";
            } else {
                int dist = x2 - x1;
                int hDist = v1 - v2;

                if (dist % hDist == 0) {
                    return "YES";
                } else {
                    return "NO";
                }
            }
        } else if (x1 > x2) {
            if (v2 <= v1) {
                return "NO";
            } else {
                int dist = x1 - x2;
                int hDist = v2 - v1;

                if (dist % hDist == 0) {
                    return "YES";
                } else {
                    return "NO";
                }
            }
        } else {
            if (v1 == v2) {
                return "YES";
            } else {
                return "NO";
            }
        }
    }
}
