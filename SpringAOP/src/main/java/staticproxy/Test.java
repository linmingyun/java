package staticproxy;

public class Test {
    public static void main(String[] args) {
        IHello hello = new ProxyHello(new Hello());//���������Ҫ��־���ܣ���ʹ�ô�����
        //IHello hello = new Hello();//������ǲ���Ҫ��־������ʹ��Ŀ����
        hello.sayHello("����");
    }
}