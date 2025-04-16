package com.kuang.www.oop.Demo02;

public class Application {

    public static void main(String[] args) {
        // Student xiaoming = new Student();
        // Student xh = new Student();
        //
        // xiaoming.name = "小明";
        // xiaoming.age = 23;
        //
        // xh.name = "小红";
        // xh.age = 23;
        //
        // xiaoming.study();
        //
        //
        //
        //
        // System.out.println(xh.name);
        // System.out.println(xh.age);

        Person person1 = new Person();
        System.out.println(person1);

        Person person = new Person(45, "哈哈");
        System.out.println("年龄=" + person.age +"\t"+ "姓名=" + person.name);


    }
}
