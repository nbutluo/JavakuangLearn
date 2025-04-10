package com.kuang.www.structer;

import java.util.Scanner;

public class demo02 {

    public static void main(String[] args) {


        System.out.println("请输入");

        Scanner scanner = new Scanner(System.in);

        String grade = scanner.nextLine();

        switch (grade) {
            case "A":
                System.out.println("优秀");
                break;
            case "B":
                System.out.println("良好");
                break;
            case "C":
                System.out.println("及格");
                break;
            default:
                System.out.println("未知");
        }
    }
}
