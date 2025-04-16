package com.kuang.www.oop.Demo01;

public class Demo05 {
    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.name);

        Demo05.change(person);
        System.out.println(person.name);
    }

    // 引用传递,吧person.name进行了赋值操作
    public static void change(Person person) {
        person.name = "哈哈";
    }
}


class Person {
    String name;
}
