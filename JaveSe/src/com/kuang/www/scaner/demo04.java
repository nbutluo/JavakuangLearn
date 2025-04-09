package com.kuang.www.scaner;

import java.util.Scanner;

public class demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        float f = 1.2F;

        System.out.println("请输入整数");

        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
            System.out.println("整数数据" + i);
        } else {
            System.out.println("输入的不是整数数据");
        }

        if (scanner.hasNextFloat()) {
            f = scanner.nextFloat();
            System.out.println("输出的浮点数为" + f);
        }


        scanner.close();
    }
}
