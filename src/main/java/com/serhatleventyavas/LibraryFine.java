package com.serhatleventyavas;

public class LibraryFine {

    public int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        int diffYear = y1 - y2;
        int diffMonth = m1 - m2;

        if (diffYear > 0) {
            return diffYear * 10000;
        } else if (diffMonth > 0) {
            return diffMonth * 500;
        }
        return 0;
    }
}
