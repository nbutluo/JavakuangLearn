package com.kuang.www.array;

import java.util.Arrays;

public class demo09 {

    public static void main(String[] args) {
        int[] arr = {8, 10, 121, 343};


        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arrays) {

        for (int i = 0; i < arrays.length - 1; i++) {

            boolean flag = false;

            for (int j = 0; j < arrays.length - 1 - i; j++) {


                int temp = 0;
                if (arrays[j + 1] < arrays[j]) {
                    temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;
                    flag = true;
                }
            }

            if (!flag) {
                break;
            }
        }

        return arrays;
    }
}
