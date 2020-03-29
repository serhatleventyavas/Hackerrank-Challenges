package com.serhatleventyavas;

public class ModifiedKaprekarNumbers {

    public String kaprekarNumbers(int p, int q) {
        String text = "";
        while (p <= q) {
            long square = (long) Math.pow(p, 2);
            String squareText = String.valueOf(square);

            if (squareText.length() > 1) {
                String firstText = squareText.substring(0, squareText.length() / 2);
                String lastText  = squareText.substring(squareText.length() / 2, squareText.length());

                int first = Integer.parseInt(firstText);
                int last  = Integer.parseInt(lastText);

                if (p == (first + last)) {
                    if (text.equalsIgnoreCase("")) {
                        text = text + String.valueOf(p);
                    } else {
                        text = text + " " + String.valueOf(p);
                    }
                }

            } else {
                if (square == p) {
                    if (text.equalsIgnoreCase("")) {
                        text = text + String.valueOf(p);
                    } else {
                        text = text + " " + String.valueOf(p);
                    }
                }
            }
            p = p + 1;
        }

        return text;
    }
}
