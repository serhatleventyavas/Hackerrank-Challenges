package com.serhatleventyavas;

public class SaveThePrisoner {

    public int saveThePrisoner(int n, int m, int s) {
        if((m+s-1)%n==0)
            return n;
        else
            return ((m+s-1)%n);
    }
}
