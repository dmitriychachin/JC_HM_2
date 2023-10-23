package org.example;

import static org.example.MinMaxDiff.array;

public class allDigitItem {
    public static int countDigit() {
        int digit = 0;
        for (int item : array) {
            if (item % 2 == 0) {
                digit++;
            }
        }
        return digit;
    }
}
