package staticproxy;

public class ProxyHello implements IHello{
    private IHello hello;
    public ProxyHello(IHello hello) {
        super();
        this.hello = hello;
    }

    public void sayHello(String str) {
        Logger.start();//����ض��ķ���
        hello.sayHello(str);
        Logger.end();
    }

}