package com.serhatleventyavas;

public class DrawingBook {

    public int pageCount(int n, int p) {
        int flipCount = 0;
        boolean isFounded = false;

        int page = 1;

        if ((n / 2) >= p) {
            // baştan başla
            while (!isFounded) {
                if (page == 1) {
                    if (page == p) {
                        isFounded = true;
                    } else {
                        page = page + 1;
                        flipCount = 1;
                    }
                } else {
                    if (page == p || (page + 1) == p) {
                        isFounded = true;
                    } else {
                        page = page + 2;
                        flipCount = flipCount + 1;
                    }
                }
            }
        } else {
            // sondan başla
            if (n % 2 == 0) {
                // tek kalacak
                page = n;
                while (!isFounded) {
                    if (page == n) {
                        if (page == p) {
                            isFounded = true;
                        } else {
                            page = page - 1;
                            flipCount = 1;
                        }
                    } else {
                        if (page == p || (page - 1) == p) {
                            isFounded = true;
                        } else {
                            page = page - 2;
                            flipCount = flipCount + 1;
                        }
                    }
                }
            } else {
                // cift kalacak
                page = n;
                while (!isFounded) {
                    if (page == p || (page - 1) == p) {
                        isFounded = true;
                    } else {
                        page = page - 2;
                        flipCount = flipCount + 1;
                    }
                }
            }
        }

        return flipCount;
    }

}
