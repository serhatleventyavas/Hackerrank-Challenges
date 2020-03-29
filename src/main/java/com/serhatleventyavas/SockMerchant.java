package com.serhatleventyavas;

public class SockMerchant {

    public int sockMerchant(int n, int[] ar) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != -1) {
                for (int j = (i + 1); j < ar.length; j++) {
                    if (ar[j] != -1) {
                        if (ar[i] == ar[j]) {
                            count = count + 1;
                            ar[i] = -1;
                            ar[j] = -1;
                        }
                    }
                }
            }
        }
        return count;
    }
}
