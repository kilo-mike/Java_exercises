package com.spartaglobal.Jakub.day1;

public class GetMax {
    public static int getMax(int numberOne, int numberTwo, int numberThree) {
        int arr[] = {numberOne, numberTwo, numberThree};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
