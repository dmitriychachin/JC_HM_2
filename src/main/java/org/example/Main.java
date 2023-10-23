package org.example;

import java.util.Arrays;

import static org.example.MinMaxDiff.array;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Массив: %s", Arrays.toString(array));
        System.out.printf("Четных элементов: %d", allDigitItem.countDigit());
        System.out.printf("Разница между max и min значениями: %d", MinMaxDiff.diffFind());
        System.out.printf("Наличие двух нулей рядом: %b", nullCouple.findCouple());
    }
}