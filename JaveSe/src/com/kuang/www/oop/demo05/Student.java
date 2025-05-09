package com.kuang.www.oop.demo05;

public class Student extends Person {

    public String name = "元数名称";

    public void test(String name) {
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
