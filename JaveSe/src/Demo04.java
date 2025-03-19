public class Demo04 {
    public static void main(String[] args) {
        int i=128;
        byte b = (byte) i;
        System.out.println(i);
        System.out.println(b); // -128 内存溢出

        float b2 = i;
        System.out.println(b2);
        // 高转低=》 强制转换
        // 低转高 =》 自动转换


        System.out.println("++++++++++++++++++++++++++++++++++++");

        System.out.println((int)45.23);
        System.out.println((int)-45.26F);

        System.out.println("=================");
        char a = 'a';
        int c = a+2;
        System.out.println(a);
        System.out.println(c);

        System.out.println((int)'b');
        System.out.println(c);
        System.out.println((char)c);
    }
}