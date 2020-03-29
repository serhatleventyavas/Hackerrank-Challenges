package com.serhatleventyavas;

public class StrongPassword {

    public int minimumNumber(int n, String password) {
        int number = 0;
        int missing = 0;

        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] lowerCase = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] upperCase = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] specialCharacters = {'!', '@', '#', '$', '%', '^', '&', '*', '(',')', '-', '+'};

        if (password.length() < 6) {
            int passwordLenght = password.length();
            for (char letter: password.toCharArray()) {
                for (char numberChar: numbers) {
                    if (letter == numberChar) {
                        passwordLenght = passwordLenght - 1;
                    }
                }
            }
            missing =  6 - password.length();
        }


        if (!isFind(password, numbers)) {
            number = number +  1;
        }

        if (!isFind(password, specialCharacters)) {
            number = number +  1;
        }

        if (!isFind(password, lowerCase)) {
            number = number +  1;
        }

        if (!isFind(password, upperCase)) {
            number = number +  1;
        }

        return number > missing ? number : missing;
    }

    private boolean isFind(String password, char[] letters) {
        boolean isFind = false;
        for (char passwordLetter: password.toCharArray()) {
            for (char letter: letters) {
                if (passwordLetter == letter) {
                    isFind = true;
                    break;
                }
            }
        }
        return isFind;
    }
}
