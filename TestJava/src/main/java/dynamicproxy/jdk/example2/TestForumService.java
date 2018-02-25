package dynamicproxy.jdk.example2;

import dynamicproxy.original.ForumService;

import java.lang.reflect.Proxy;
public class TestForumService {
    public static void main(String[] args) {

        //��ϣ���������Ŀ��ҵ����
        ForumService target = new ForumServiceImpl();

        //�ڽ�Ŀ��ҵ����ͺ��д����֯��һ��
        PerformanceHandler handler = new PerformanceHandler(target);

        //�۸��ݱ�֯��Ŀ��ҵ�����߼������ܼ��Ӻ����߼���InvocationHandlerʵ����������ʵ��
        ForumService proxy = (ForumService) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler);

        //�ܵ��ô���ʵ��
        proxy.removeForum(10);
        proxy.removeTopic(1012);
    }
}