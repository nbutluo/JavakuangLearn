package com.kuang.www.method;

public class Func04 {
    public static void main(String[] args) {

        Func04 func04 = new Func04();

        func04.test(1111, 2222, 3333,5555);
    }

    public void test(int... arg) {


        for (int i = 0; i < arg.length; i++) {
            System.out.println(arg[i]);
        }
    }
}
