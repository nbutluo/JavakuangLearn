package com.kuang.www.array;

public class demo02 {

    public static void main(String[] args) {
        // 静态初始化数组
        int[] arr = {1, 2, 3, 4, 5};
//        System.out.println(arr[4]);
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }

        int[] arr2 = new int[10];

        arr2[0] = 10;
        System.out.println(arr2[0]);
    }
}
