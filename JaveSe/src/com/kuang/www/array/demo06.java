package com.kuang.www.array;

public class demo06 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};

        for (int[] its : arr) {
            for (int anInt : its) {
                System.out.println(anInt);
            }
        }
    }
}
