package com.kuang.www.array;

import java.util.Arrays;

public class demo08 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 5, 77, 85, 6};

        //System.out.println(Arrays.toString(arr));
        int[] sortNew = sort(arr);

        System.out.println(Arrays.toString(sortNew));

    }

    // 冒泡排序
    public static int[] sort(int[] arrays) {

        // 先确定外层循环
        for (int i = 0; i < arrays.length - 1; i++) {
            // 内层循环
            for (int j = 0; j < arrays.length - 1 - i; j++) {

                int temp;
                if (arrays[j + 1] > arrays[j]) {

                    temp = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = temp;

                }
            }

        }

        return arrays;

    }
}
