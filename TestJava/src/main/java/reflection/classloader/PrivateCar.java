package reflection.classloader;

public class PrivateCar {
    //��private��Ա������ʹ�ô�ͳ����ʵ�����÷�ʽ��ֻ���ڱ����з���
    private String color;
    //��protected������ʹ�ô�ͳ����ʵ�����÷�ʽ��ֻ��������ͱ����з���
    protected void drive(){
        System.out.println("drive private car! the color is:"+color);
    }
}