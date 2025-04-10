package com.kuang.www.structer;

public class fordemo4 {

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {

            if (i % 5 == 0) {
                System.out.print(i + "\t");
            }

            // 每行输出三个

            if (i % ((5 * 3)) == 0) {
                System.out.println();
            }
        }
    }
}
