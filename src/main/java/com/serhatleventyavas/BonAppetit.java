package com.serhatleventyavas;

import java.util.ArrayList;
import java.util.List;

public class BonAppetit {

    public String bonAppetit(List<Integer> bill, int k, int b) {
        int sumCost = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i != k) {
                sumCost = sumCost + bill.get(i);
            }
        }

        int costPerPerson = sumCost / 2;
        if (costPerPerson == b) {
            return "Bon Appetit";
        } else {
            return String.valueOf(b - costPerPerson);
        }
    }
}