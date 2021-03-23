package com.spartaglobal.Jakub.day1;

public class Loops {

    public static void switchLoops(int a) {
        switch (a) {
            case 1:
                forLoop();
                break;
            case 2:
                doWhileLoop();
                break;
            case 3:
                whileLoop();
                break;
            case 4:
                advancedForLoop();
                break;
            default:
                System.out.println("Error");
        }
    }

    public static void forLoop() {
        for (int i = 1; i < 7; i++) {
            System.out.println("number: " + i);
        }
    }

    public static void doWhileLoop() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

    }

    public static void whileLoop() {
        int i = 1;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

    }

    public static void advancedForLoop() {
        int[] arr = {1, 2, 4, 5, 6};
        for (Integer a : arr) {
            System.out.println(a);
        }
    }
}

