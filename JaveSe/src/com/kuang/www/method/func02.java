package com.kuang.www.method;

public class func02 {

    public static void main(String[] args) {

//        int sum = add(1, 3);  // 实参
//
//        System.out.println(sum);

        int diff = max(1, 2, 3);
//        double diff = max(10.20, 20.20);
        System.out.println(diff);
    }

    public static int add(int a, int b) {
        return a + b;
    }


    public static int max(int num1, int num2) {

        if (num1 == num2) {
            System.out.println("num1==num2");

            return 0;
        }

        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }

    }

    public static int max(int num1, int num2, int num3) {


        if (num1 == num2) {
            System.out.println("num1==num2");

            return 0;
        }

        return num3;
//        if (num1 > num2) {
//            return num1;
//        } else {
//            return num2;
//        }



    }

    public static double max(double num1, double num2) {

        if (num1 == num2) {
            System.out.println("num1==num2");

            return 0;
        }

        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }

    }

}
