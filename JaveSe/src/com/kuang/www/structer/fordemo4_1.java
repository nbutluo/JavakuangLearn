package com.kuang.www.structer;

public class fordemo4_1 {

    public static void main(String[] args) {


        // 使用while实现
        int i = 0;
        while (i <= 1000) {

            if (i % 5 == 0) {
                System.out.print(i + "\t");
            }


            // 每行输出三个
            if (i % ((5 * 3)) == 0) {
                System.out.println();
            }

            i++;
        }

    }
}
