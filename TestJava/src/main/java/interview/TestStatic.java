package interview;

public class TestStatic {
    public static void main(String[] args) {
        test();
    }
    public TestStatic() {
        System.out.println("y");
    }
    static {
        System.out.println("0");
    }
    static TestStatic ts = new TestStatic();
    static {
        System.out.println("1");
    }
    {
        System.out.println("x");
    }
    public static void test() {
        System.out.println(i);
    }
    public static int i = 2;
}