package dynamicproxy.cglib.example2;

import java.lang.reflect.Method;

import dynamicproxy.original.PerformanceMonitor;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
    private Enhancer enhancer = new Enhancer();
    public Object getProxy(Class clazz) {
        enhancer.setSuperclass(clazz); //�� ������Ҫ�����������
        enhancer.setCallback(this);
        return enhancer.create(); //��ͨ���ֽ��뼼����̬��������ʵ��
    }

    //�����ظ������з����ĵ���
    public Object intercept(Object obj, Method method, Object[] args,
                            MethodProxy proxy) throws Throwable {
        PerformanceMonitor.begin(obj.getClass().getName()+"."+method. getName());//��-1
        Object result=proxy.invokeSuper(obj, args); //��-2
        PerformanceMonitor.end();//��-1ͨ����������ø����еķ���
        return result;
    }
}