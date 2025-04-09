package com.kuang.www.scaner;

import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入");
//        if (scanner.hasNextLine()) {
//            String str = scanner.nextLine();
//            System.out.println("输出的内容为" + str);
//        }


        String str = scanner.nextLine();

        System.out.println("输出的内容为"+str);

        scanner.close();
    }
}
