package com.kuang.www.oop.Demo06;

public class Application {

    public static void main(String[] args) {
        Student stu = new Student();

        stu.say();
//        System.out.println(stu.getMoney());

        int money =  stu.getMoney();
        System.out.println("获得的钱财为"+money);

    }
}
