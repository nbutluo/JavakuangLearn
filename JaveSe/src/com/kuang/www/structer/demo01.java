package com.kuang.www.structer;

import java.util.Scanner;

public class demo01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入");

        String str = scanner.nextLine();
        if (str.equals("hello")) {
            System.out.println("输出的数据为" + str);
        } else {
            System.out.println("输出的数据不符合规范");
        }


        scanner.close();
    }
}
