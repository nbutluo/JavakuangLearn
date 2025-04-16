package com.kuang.www.array;

import java.util.Arrays;

public class demo07 {
    public static void main(String[] args) {
        int[] a = {1, 2, 8, 10, 44, 66, 3, 4, 5};

        Arrays.fill(a, 888);  // 填充
        //Arrays.sort(a);   // 排序
        System.out.println(Arrays.toString(a));

        int[] b = {1, 2, 3};
        int[] c = {1, 2, 3};

        boolean res = Arrays.equals(c, b);

        System.out.println(res);
    }
}
