package com.kuang.www.oop.Demo03;

public class Application  extends  Student {

    public static void main(String[] args) {
        Student s1 = new Student();

        // s1.name = "haha";
        s1.setName("小明");
        s1.setAge(46,"哈哈");

        System.out.println(s1.getName());
        System.out.println(s1.getAge());  //  72
    }
}
