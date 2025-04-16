package com.kuang.www.array;

public class demo04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};


        //printArray(arrs);
        printArray(rerverse(arr));
    }

    public static int[] rerverse(int[] arrays) {

        int[] result = new int[arrays.length];

        for (int i = 0, j = result.length - 1; i < arrays.length; i++, j--) {
            result[j] = arrays[i];
        }

        return result;
    }

    public static void printArray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }
}
