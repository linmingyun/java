package dynamicproxy.jdk.example1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggerHandler implements InvocationHandler {
    private Object target;
    public LoggerHandler(Object target) {
        this.target = target;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("......log start......");
        Object result = method.invoke(target, args);
        System.out.println("......log end......");
        return result;
    }
}
