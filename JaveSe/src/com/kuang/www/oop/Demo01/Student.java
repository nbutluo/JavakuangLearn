package com.kuang.www.oop.Demo01;

public class Student {

    // 静态的,和类一起加载的
    public static void say() {
        System.out.println("学生说话了");
    }

    // 非静态的方法,类实例化之后存在
    public void listen() {
        System.out.println("学生听课");
    }
}
