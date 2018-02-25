package dynamicproxy.jdk.example2;

import dynamicproxy.original.PerformanceMonitor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PerformanceHandler implements InvocationHandler { //��ʵ��InvocationHandler
    private Object target;
    public PerformanceHandler(Object target){ //��targetΪĿ���ҵ����
        this.target = target;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        PerformanceMonitor.begin(target.getClass().getName()+"."+ method. getName());
        Object obj = method.invoke(target, args); // ��-2ͨ�����䷽������ҵ�����Ŀ�귽��
        PerformanceMonitor.end();
        return obj;
    }
}