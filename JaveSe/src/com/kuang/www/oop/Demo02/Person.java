package com.kuang.www.oop.Demo02;

public class Person {
    String name;
    Integer age;


    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
