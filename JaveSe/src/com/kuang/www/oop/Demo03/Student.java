package com.kuang.www.oop.Demo03;

public class Student {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAge(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
