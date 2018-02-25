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
�����������ɹ�����Enhancer��ʵ�֣���Ų������£�
1�����ɴ�����Class�Ķ������ֽ��룻
2��ͨ��Class.forName���ض������ֽ��룬����Class����
3��ͨ��������ƻ�ȡʵ�����죬����ʼ�����������
*/