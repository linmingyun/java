package reflection.example1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestReflection {

    public static void main(String[] args) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException,
            NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

        //获得一个Calculator Class对象
        Class<?> clz = Class.forName("reflection.example1.Calculator");
        //创建一个Calculator对象
        Object o = clz.newInstance();
        //得到add方法
        Method addMethod = clz.getMethod("add", int.class, int.class); //获取public方法
        //调用add方法
        Object result = addMethod.invoke(o,10,20);
        System.out.println(result);

        //获得特定的方法
        Method method = clz.getDeclaredMethod("add", int.class, int.class); //获取一个方法（public和非public）
        System.out.println(method.invoke(o,1,2));
        //获得方法的返回类型
        System.out.println(method.getReturnType());
        //获得方法的传入参数类型
        System.out.println(method.getParameterTypes()[0]);
        //获取所有的构造方法
        System.out.println(clz.getDeclaredConstructors());
        //获取某类的父类
        System.out.println(clz.getSuperclass());
        //获取某类实现的接口
        System.out.println(clz.getInterfaces());

        ////////////////////////////////////////////////////////////////////

        //获取类
        getClassByReflection();

        //获取所有属性
        getAllProperties();

        //获取特定属性
        getProperty();

        //获取所有的方法
        getAllMethods();
    }

    public static void getClassByReflection() throws ClassNotFoundException {
        //第一种方式
        //常用这种，字符串可以传入也可以写在配置文件中
        Class clz = Class.forName("reflection.example1.Calculator");
        System.out.println(clz);

        //第二种方式
        //需要导入类的包，依赖太强，不导包就抛编译错误
        //java中每个类型都有class属性
        Class cls = Calculator.class;
        System.out.println(cls);

        //第三种方式
        //这种方式对象都有了，还要反射干什么
        //java语言中任何一个java对象都有getClass方法
        Calculator calculator = new Calculator();
        //cla是运行时类(calculator的运行时类是Calculator)
        Class cla = calculator.getClass();
        System.out.println(cla);
    }

    public static void getAllProperties() throws ClassNotFoundException {
        //获取整个类
        Class c = Class.forName("java.lang.Integer");
        //获取所有的属性
        Field[] fs = c.getDeclaredFields();
        //定义可变长的字符串，用来存储属性
        StringBuffer sb = new StringBuffer();
        //通过追加的方法，将每个属性拼接到此字符串中
        sb.append(Modifier.toString(c.getModifiers()) + " class " + c.getSimpleName() + "{\n");
        //遍历里面的每一个属性
        for (Field field : fs) {
            sb.append("\t"); //空格
            //获得属性的修饰符，例如public，static等等
            sb.append(Modifier.toString(field.getModifiers())+" ");
            //属性的类型的名字
            sb.append(field.getType().getSimpleName() + " ");
            //属性的名字+回车
            sb.append(field.getName()+";\n");
        }
        sb.append("}");
        System.out.println(sb);
    }

    public static void getProperty() throws ClassNotFoundException,
            NoSuchFieldException, IllegalAccessException, InstantiationException {
        //获取整个类
        Class c = Class.forName("reflection.example1.Calculator");
        //获取某个属性
        Field field = c.getDeclaredField("num");
        //实例化
        Object o = c.newInstance();
        //打破封装
        //使用反射机制可以打破封装性，导致了java对象的属性不安全。
        field.setAccessible(true);
        //给o对象的属性赋值
        field.set(o, 111);
        System.out.println(field.get(o));
    }

    public static void getAllMethods() throws ClassNotFoundException {
        //获取整个类
        Class c = Class.forName("java.lang.Object");
        //获取所有的方法
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
