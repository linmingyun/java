package reflection.example1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class TestReflection {

    public static void main(String[] args) throws ClassNotFoundException,
            IllegalAccessException, InstantiationException,
            NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

        //���һ��Calculator Class����
        Class<?> clz = Class.forName("reflection.example1.Calculator");
        //����һ��Calculator����
        Object o = clz.newInstance();
        //�õ�add����
        Method addMethod = clz.getMethod("add", int.class, int.class); //��ȡpublic����
        //����add����
        Object result = addMethod.invoke(o,10,20);
        System.out.println(result);

        //����ض��ķ���
        Method method = clz.getDeclaredMethod("add", int.class, int.class); //��ȡһ��������public�ͷ�public��
        System.out.println(method.invoke(o,1,2));
        //��÷����ķ�������
        System.out.println(method.getReturnType());
        //��÷����Ĵ����������
        System.out.println(method.getParameterTypes()[0]);
        //��ȡ���еĹ��췽��
        System.out.println(clz.getDeclaredConstructors());
        //��ȡĳ��ĸ���
        System.out.println(clz.getSuperclass());
        //��ȡĳ��ʵ�ֵĽӿ�
        System.out.println(clz.getInterfaces());

        ////////////////////////////////////////////////////////////////////

        //��ȡ��
        getClassByReflection();

        //��ȡ��������
        getAllProperties();

        //��ȡ�ض�����
        getProperty();

        //��ȡ���еķ���
        getAllMethods();
    }

    public static void getClassByReflection() throws ClassNotFoundException {
        //��һ�ַ�ʽ
        //�������֣��ַ������Դ���Ҳ����д�������ļ���
        Class clz = Class.forName("reflection.example1.Calculator");
        System.out.println(clz);

        //�ڶ��ַ�ʽ
        //��Ҫ������İ�������̫ǿ�����������ױ������
        //java��ÿ�����Ͷ���class����
        Class cls = Calculator.class;
        System.out.println(cls);

        //�����ַ�ʽ
        //���ַ�ʽ�������ˣ���Ҫ�����ʲô
        //java�������κ�һ��java������getClass����
        Calculator calculator = new Calculator();
        //cla������ʱ��(calculator������ʱ����Calculator)
        Class cla = calculator.getClass();
        System.out.println(cla);
    }

    public static void getAllProperties() throws ClassNotFoundException {
        //��ȡ������
        Class c = Class.forName("java.lang.Integer");
        //��ȡ���е�����
        Field[] fs = c.getDeclaredFields();
        //����ɱ䳤���ַ����������洢����
        StringBuffer sb = new StringBuffer();
        //ͨ��׷�ӵķ�������ÿ������ƴ�ӵ����ַ�����
        sb.append(Modifier.toString(c.getModifiers()) + " class " + c.getSimpleName() + "{\n");
        //���������ÿһ������
        for (Field field : fs) {
            sb.append("\t"); //�ո�
            //������Ե����η�������public��static�ȵ�
            sb.append(Modifier.toString(field.getModifiers())+" ");
            //���Ե����͵�����
            sb.append(field.getType().getSimpleName() + " ");
            //���Ե�����+�س�
            sb.append(field.getName()+";\n");
        }
        sb.append("}");
        System.out.println(sb);
    }

    public static void getProperty() throws ClassNotFoundException,
            NoSuchFieldException, IllegalAccessException, InstantiationException {
        //��ȡ������
        Class c = Class.forName("reflection.example1.Calculator");
        //��ȡĳ������
        Field field = c.getDeclaredField("num");
        //ʵ����
        Object o = c.newInstance();
        //���Ʒ�װ
        //ʹ�÷�����ƿ��Դ��Ʒ�װ�ԣ�������java��������Բ���ȫ��
        field.setAccessible(true);
        //��o��������Ը�ֵ
        field.set(o, 111);
        System.out.println(field.get(o));
    }

    public static void getAllMethods() throws ClassNotFoundException {
        //��ȡ������
        Class c = Class.forName("java.lang.Object");
        //��ȡ���еķ���
        Method[] methods = c.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
