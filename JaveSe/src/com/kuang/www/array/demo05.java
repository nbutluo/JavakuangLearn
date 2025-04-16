package com.kuang.www.array;

public class demo05 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        //printArray(arr);
        printArray(reverse(arr));
    }

    // 数组反转
    public static int[] reverse(int[] array) {
        int[] result = new int[array.length]; // 定义一个数组,长度与传入的数组长度一致,

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            result[j] = array[i];
        }

        return result;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
