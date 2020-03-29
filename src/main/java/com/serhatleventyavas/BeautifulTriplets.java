package com.serhatleventyavas;

public class BeautifulTriplets {

    public int beautifulTriplets(int d, int[] arr) {
        int count = 0;

        for (int i = 0 ; i < arr.length; i++) {
            int n1 = arr[i];

            for (int j = i + 1; j < arr.length; j++) {

                int n2 = arr[j];

                int diffN2N1 = n2 - n1;

                if (diffN2N1 == d) {
                    for (int k = j + 1; k < arr.length; k++) {

                        int n3 = arr[k];

                        int diffN3N2 = n3 - n2;

                        if (diffN2N1 == diffN3N2) {
                            count = count + 1;
                        }
                    }
                }

            }
        }

        return count;
    }
}
