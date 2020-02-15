package dynamicproxy;

import staticproxy.Logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynaProxyHello implements InvocationHandler {

    private Object target;//Ŀ�����
    /**
     * ͨ��������ʵ����Ŀ�����
     * @param object
     * @return
     */
    public Object bind(Object object){
        this.target = object;
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        Object result = null;
        Logger.start();//��Ӷ���ķ���
        //ͨ���������������Ŀ�����ķ���
        result = method.invoke(this.target, args);
        Logger.end();
        return result;
    }

}