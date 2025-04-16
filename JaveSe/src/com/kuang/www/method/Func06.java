package com.kuang.www.method;

public class Func06 {
    public static void main(String[] args) {
        int sum = f(5);
        System.out.println(sum);
    }

    public static int f(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * f(n - 1);
        }
    }
}
