package staticproxy;

public class Hello implements IHello{

    public void sayHello(String str) {
        System.out.println("hello "+str);
    }

}