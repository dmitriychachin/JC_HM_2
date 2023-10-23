package org.example;

import java.util.Random;

public class MinMaxDiff {

    public static int[] createArray(){
        Random random = new Random();
        int[] array = new int[8];
        for (int item:array) {
            item = random.nextInt(1,20);
        }
        return array;
    }

    public int minFind(int[] array){

        int min = array[0];
        for (int item:array) {
            if(item < min){
                min = item;
            }
        }
        return min;
    }

    public int maxFind(int[] array){
        int max = array[0];
        for (int item:array) {
            if (item < max) {
                max = item;
            }
        }
        return max;
    }

    public static int[] array = createArray();

    public static int diffFind(){
        int max = maxFind(array);
        int min = minFind(array);
        int diff = max - min;
        return diff;
    }
}
