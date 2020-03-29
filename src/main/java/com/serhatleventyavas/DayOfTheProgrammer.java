package com.serhatleventyavas;

public class DayOfTheProgrammer {

    public String dayOfProgrammer(int year) {
        int day = 215;

        int feb = 0;

        if (year < 1918) {
            feb = !(year % 4 == 0) ? 28: 29;
        } else if (year > 1918) {
            feb = (year % 400 == 0) || !(year % 100 == 0) && (year % 4 == 0) ? 29:28;
        } else {
            feb = 15;
        }

        System.out.println(String.valueOf(feb));

        feb = 256 - (day + feb);
        return String.valueOf(feb) + ".09." + String.valueOf(year);
    }
}
