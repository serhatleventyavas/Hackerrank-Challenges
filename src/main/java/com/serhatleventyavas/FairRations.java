package com.serhatleventyavas;

public class FairRations {

    /**
     * Rankhacker Castle hükümdarı bugün halkına ekmek dağıtacak.
     * Kale zor zamanlardan geçiyor, bu yüzden mümkün oldukça az ekmek dağıtmamız gerekiyor.
     *
     */
    public String fairRations(int[] numberOfLoaves) {
        int totalLoaveBreads = 0;

        for (int i = 0; i < numberOfLoaves.length; i++) {
            if (numberOfLoaves[i] % 2 == 1) {
                int before = i - 1;
                int after  = i + 1;

                if (after < numberOfLoaves.length) {
                    numberOfLoaves[after] = numberOfLoaves[after] + 1;
                    totalLoaveBreads = totalLoaveBreads + 1;

                    numberOfLoaves[i] = numberOfLoaves[i] + 1;
                    totalLoaveBreads = totalLoaveBreads + 1;
                }
            }
        }

        for (int i = 0; i < numberOfLoaves.length; i++) {
            if (numberOfLoaves[i] % 2 == 1) {
                return "NO";
            }
        }
        return String.valueOf(totalLoaveBreads);
    }
}
