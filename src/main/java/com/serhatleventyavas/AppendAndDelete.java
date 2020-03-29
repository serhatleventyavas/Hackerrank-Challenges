package com.serhatleventyavas;

public class AppendAndDelete {

    public String appendAndDelete(String s, String t, int k) {
        int length = Math.min(s.length(), t.length());

        int common = 0;

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == t.charAt(i)) {
                common = common + 1;
            } else {
                break;
            }
        }

        if ((s.length() + t.length()) - 2 * common > k) {
            return "No";
        } else if (((s.length() + t.length()) - 2 * common) % 2 == k % 2) {
            return "Yes";
        } else if (s.length() + t.length() - k < 0) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
