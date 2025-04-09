package com.kuang.www.scaner;

import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next方法接收");

        if (scanner.hasNext()) {
            String str = scanner.next();
            System.out.println("输入的内容为：" + str);
        }

        // 凡是属于IO流的类如果不关闭会一直占用资源
        scanner.close();
    }
}
