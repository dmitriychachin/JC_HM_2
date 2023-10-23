package org.example;

import static org.example.MinMaxDiff.array;

public class nullCouple {

    public static boolean findCouple(){
        int ref = array[0];
        for (int item:array) {
            if (ref == 0 && item == 0){
                return true;
            }
            else{
                ref = item;
            }
        }
        return false;
    }
}
