package com.serhatleventyavas;

public class UtopianTree {

    public int utopianTree(int n) {
        if (n == 0) {
            return 1;
        } else {
            int height = 0;
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    height = height + 1;
                } else {
                    height = height* 2;
                }
            }
            return height;
        }
    }
}
