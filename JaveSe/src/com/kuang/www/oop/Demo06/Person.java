package com.kuang.www.oop.Demo06;

public class Person {

    private int money = 10_0000_0000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void say() {
        System.out.println("说了一句话");
    }
}
