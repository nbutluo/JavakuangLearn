package com.kuang.www.oop.Demo01;

public class Demo04 {
    public static void main(String[] args) {

        int a = 1;
        test(a);
        System.out.println(a);  // a=1
    }


    // 值传递
    public static void test(int a) {
        a = 10;
    }
}
