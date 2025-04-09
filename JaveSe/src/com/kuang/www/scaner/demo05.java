package com.kuang.www.scaner;

import java.util.Scanner;

public class demo05 {
    public static void main(String[] args) {
        // 计算平均数

        int i = 0;
        float sum = 0.0F;

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();

            sum += x;

            System.out.println("您输入的第一个数为:" + x);
            System.out.println("当前总和为sum=" + sum);

            i++;

        }

        System.out.println("输入的总个数为" + i);
        System.out.println("总和为" + sum);
        System.out.println("平均数为" + (sum / i));


        //
        scanner.close();
    }
}
