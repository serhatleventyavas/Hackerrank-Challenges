package com.serhatleventyavas;

public class BeautifulDaysAtTheMovies {

    public int beautifulDays(int i, int j, int k) {
        int[] dayArray = new int[(j - i) + 1];
        int count = 0;

        int index = 0;
        for (int d = i; d <= j; d++) {
            dayArray[index] = d;
            index = index + 1;
        }

        for (int day: dayArray) {
            char[] charArray = String.valueOf(day).toCharArray();
            String textOfDay = "";
            for (char c: charArray) {
                textOfDay = String.valueOf(c) + textOfDay;
            }
            int reserveDay = Integer.parseInt(textOfDay);
            int diff = day - reserveDay;
            if (diff % k == 0)
                count = count + 1;
        }
        return count;
    }
}
