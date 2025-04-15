package com.kuang.www.method;

public class Func04_1 {
    public static void main(String[] args) {

        testDiff(111, 222, 50, 60, 888, 6667.12);
//        testDiff();
    }

    public static void testDiff(double... args) {

        if (args.length == 0) {
            System.out.println("参数不能为空");
        }

        double result = args[0];

//        for (int i = 0; i < args.length; i++) {
//            if (args[i] > result) {
//                result = args[i];
//            }
//        }

        for (double arg : args) {
            if (arg > result) {
                result = arg;
            }
        }




        System.out.println("最大值为=" + result);
    }
}
