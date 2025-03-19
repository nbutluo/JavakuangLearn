public class Demo05 {

    public static void main(String[] args) {
        // 大数据计算
        int money = 10_0000_0000;

//        System.out.println(money);

        int year = 20;

        int total = money * year;

        System.out.println(total);  // -1474836480 内存溢出

        long total2 = money * year;
        System.out.println(total2);


        long total3 = money * ((long)year);
        System.out.println(total3);

        System.out.println("int MIN:"+Integer.MIN_VALUE);
        System.out.println("int MAX:"+Integer.MAX_VALUE);
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);

        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);

    }
}
