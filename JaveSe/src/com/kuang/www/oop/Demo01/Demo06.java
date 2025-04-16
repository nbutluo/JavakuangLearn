package com.kuang.www.oop.Demo01;

public class Demo06 {

    public static void main(String[] args) {
        Person2 person = new Person2();

        System.out.println(person.name);

        Demo06.change(person);

        System.out.println(person.name);
    }

    // 赋值操作
    public static void change(Person2 person) {
        person.name = "嘻嘻";
    }


}

class Person2 {
    String name;
}

