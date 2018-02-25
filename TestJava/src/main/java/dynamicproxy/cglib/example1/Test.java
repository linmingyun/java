package dynamicproxy.cglib.example1;

import net.sf.cglib.proxy.Enhancer;

public class Test {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserServiceImpl.class);
        enhancer.setCallback(new MyMethodInterceptor());
        UserServiceImpl userService = (UserServiceImpl)enhancer.create();
        userService.add();
    }
}
/*
代理对象的生成过程由Enhancer类实现，大概步骤如下：
1、生成代理类Class的二进制字节码；
2、通过Class.forName加载二进制字节码，生成Class对象；
3、通过反射机制获取实例构造，并初始化代理类对象。
*/