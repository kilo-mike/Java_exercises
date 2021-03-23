package com.spartaglobal.Jakub.day1;

public class Prime {
    public static void prime(int count){
        if (count<1){
            System.out.println("not prime");
        }else {
            for (int i =2; i<count;i++){
                if (count%i==0){
                    System.out.println("not prime");
                    break;
                }else
                    System.out.println("prime");
                    break;
            }

        }

    }
}
