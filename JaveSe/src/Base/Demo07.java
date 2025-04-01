package Base;

public class Demo07 {

    // 实例变量
    String userName;
    int userAge;
    static int salary = 2500;  // 类变量

    public static void main(String[] args) {
        // int i = 10;  // 局部变量

        Demo07 demo07 = new Demo07();
        System.out.println(demo07.userName);
        System.out.println(demo07.userAge);

        System.out.println(salary);
    }
}
