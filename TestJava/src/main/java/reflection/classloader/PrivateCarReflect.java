package reflection.classloader;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PrivateCarReflect {
    public static void main(String[] args) throws Throwable{
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("reflection.classloader.PrivateCar");
        PrivateCar pcar = (PrivateCar)clazz.newInstance();

        Field colorFld = clazz.getDeclaredField("color");
        //��ȡ��Java���Է��ʼ���Է���private����
        colorFld.setAccessible(true);
        colorFld.set(pcar,"��ɫ");

        Method driveMtd = clazz.getDeclaredMethod("drive",(Class[])null);
        //Method driveMtd = clazz.getDeclaredMethod("drive"); JDK5.0��ʹ��

        //��ȡ��Java���Է��ʼ���Է���protected����
        driveMtd.setAccessible(true);
        driveMtd.invoke(pcar,(Object[])null);
        //color������drive()��������˽�еģ�ͨ����ʵ�������޷����ⲿ����˽�б���������˽�з����ģ���ͨ���������ȴ�����ƹ��������
    }
}