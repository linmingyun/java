package dynamicproxy.aop;

import staticproxy.Hello;
import staticproxy.IHello;

//ͨ���������ӣ����Է���ͨ����̬����ͷ��似�����Ѿ�����ʵ����AOP�Ĺ��ܣ�
//�������ֻ��Ҫ�ڷ���ִ��ǰ��ӡ��־������Բ�ʵ��end()�����������Ϳ��Կ��ƴ�ӡ��ʱ���ˡ�
//�����������ָ���ķ�����ӡ��־������ֻ��Ҫ��invoke���������м�һ����method���ֵ��жϣ�
//method�����ֿ���д��xml�ļ��У��������ǾͿ���ʵ���������ļ����н����ˣ�
//�������Ǿ�ʵ����һ���򵥵�spring aop��ܡ�
public class DynaTest1 {
    public static void main(String[] args) {
        IHello hello = (IHello) new DynaProxyHello1().bind(new Hello(),new DLogger());//���������Ҫ��־���ܣ���ʹ�ô�����
        //IHello hello = new Hello();//������ǲ���Ҫ��־������ʹ��Ŀ����
        hello.sayHello("����");
    }
}