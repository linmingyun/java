package dynamicproxy.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynaProxyHello1 implements InvocationHandler {
    //���ö���
    private Object proxy;
    //Ŀ�����
    private Object target;

    public Object bind(Object target,Object proxy){
        this.target=target;
        this.proxy=proxy;
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        Object result = null;
        //����õ������ߵ�ʵ��
        Class clazz = this.proxy.getClass();
        //����õ������ߵ�Start����
        Method start = clazz.getDeclaredMethod("start", new Class[]{Method.class});
        //����ִ��start����
        start.invoke(this.proxy, new Object[]{this.proxy.getClass()});
        //ִ��Ҫ��������ԭ������
        method.invoke(this.target, args);
        //����õ������ߵ�end����
        Method end = clazz.getDeclaredMethod("end", new Class[]{Method.class});
        //����ִ��end����
        end.invoke(this.proxy, new Object[]{method});
        return result;
    }

}