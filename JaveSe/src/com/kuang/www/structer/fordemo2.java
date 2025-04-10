package com.kuang.www.structer;

public class fordemo2 {

    public static void main(String[] args) {

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }

        }

        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
