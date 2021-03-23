package com.spartaglobal.Jakub.day1;

public class Fibonacci {

    public static void fibb(int count) {
        int n1 = 0;
        int n2 = 1;

        for (int i = 1; i <= count; i++) {
            System.out.print(n1 + " ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }

}
