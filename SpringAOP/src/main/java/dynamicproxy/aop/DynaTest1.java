package dynamicproxy.aop;

import staticproxy.Hello;
import staticproxy.IHello;

//通过上面例子，可以发现通过动态代理和发射技术，已经基本实现了AOP的功能，
//如果我们只需要在方法执行前打印日志，则可以不实现end()方法，这样就可以控制打印的时机了。
//如果我们想让指定的方法打印日志，我们只需要在invoke（）方法中加一个对method名字的判断，
//method的名字可以写在xml文件中，这样我们就可以实现以配置文件进行解耦了，
//这样我们就实现了一个简单的spring aop框架。
public class DynaTest1 {
    public static void main(String[] args) {
        IHello hello = (IHello) new DynaProxyHello1().bind(new Hello(),new DLogger());//如果我们需要日志功能，则使用代理类
        //IHello hello = new Hello();//如果我们不需要日志功能则使用目标类
        hello.sayHello("明天");
    }
}