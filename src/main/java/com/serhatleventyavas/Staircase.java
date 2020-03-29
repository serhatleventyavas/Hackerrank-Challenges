package com.serhatleventyavas;

public class Staircase {

    public String staircase(int n) {
        String result = "";
        for(int i = 1; i <= n; i++){

            int j = n;

            while(j-- > i) {
                result = result + " ";
            }
            while(j-- >= 0) {
                result = result + "#";
            }

            result = result + "\n";
        }
        return result;
    }
}
