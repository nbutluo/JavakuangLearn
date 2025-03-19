public class Demo03 {

    public static void main(String[] args) {

        // 整数拓展 进制： 二进制 0b 八进制0 十六进制0x

        int i = 10;
        int i2 = 010;
        int i3 = 0x10;
        float f = 0.1f;
        double d = 1.0 / 10;

        System.out.println("i=="+i);
        System.out.println("i2=="+i2);
        System.out.println("i3=="+i3);

//        System.out.println(f==d);

        // 对于这种需要精度计算，不要使用浮点数，使用     bigDecimal

        char c1 = 'a';
        char c2 = '中';

        System.out.println(c1);
        System.out.println(c2);

        char c3 = '\u0061';
        System.out.println("c3=" + c3);

        System.out.println((int) c1);

        // 转义符 \t \n
        System.out.println("Hello\tWorld");
        System.out.println("Hello\nWorld");

        String sa = new String("hello world");
        String sb = new String("hello world");

        System.out.println(sa == sb);

        String sc = "hello world";
        String sd = "hello world";
        System.out.println(sc == sd);

        // 布尔值扩展

    }
}