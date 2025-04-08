package com.kuang.www.Operator;

public class Demo04 {
    public static void main(String[] args) {
        // 自增运算符

        int a = 3;
        int b = a++;  // b =3  a=4
        int c = ++a;  // a=5 c=5

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // 幂运算
        double d = Math.pow(4,3);
        System.out.println(d);
    }


}
