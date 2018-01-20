package annotation;

public class Calculator {
    @Test
    public void add() {
        System.out.println("add method");
    }

    @Test
    public void minus() {
        System.out.println("minus method");
    }

    @Test(ignore = true)
    public void multiply() {
        System.out.println("multiply method");
    }

    @Test(ignore = false)
    public void divide() {
        System.out.println("divide method");
    }
}
