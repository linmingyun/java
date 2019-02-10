package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//这个注解表明自定义的注解Component是用来标记谁的，
//其中ElementType.TYPE表示这个注解是用来标记类型的，也就是可以标记类、接口等。
//此外还有FIELD、METHOD等，分别表示用来标记字段、方法等。
@Target(ElementType.TYPE)
//表示这个自定义的注解需要保留到什么时候，如只保留到源码中，编译之后就没有了；
//或者保留到运行时，就是在运行的时候也一直有。这里设置为运行时。
@Retention(RetentionPolicy.RUNTIME)
public @interface Component {
    public String id();
}