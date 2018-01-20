package reflection.example6;

import java.io.*;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 * �������÷���������ļ�������ʹ��Ӧ�ó������ʱ����Դ����������κ��޸�
 * ����ֻ��Ҫ�����෢�͸��ͻ��ˣ����޸������ļ�����
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        //1.ͨ�������ȡClass����
        Class stuClass = Class.forName(getValue("className"));
        //2.��ȡshow()����
        Method m = stuClass.getMethod(getValue("methodName"));
        //3.����show()����
        m.invoke(stuClass.getConstructor().newInstance());

    }

    //�˷�������һ��key���������ļ��л�ȡ��Ӧ��value
    public static String getValue(String key) throws IOException{
        Properties pro = new Properties();//��ȡ�����ļ��Ķ���
        String path = "D:\\WORK\\WorkSpace\\IDEA\\JavaPractice\\TestJava\\src\\main\\java\\reflection\\example6\\pro.txt";
        FileInputStream in = new FileInputStream(path);//��ȡ������
        pro.load(in);//�������ص������ļ�������
        in.close();
        return pro.getProperty(key);//���ظ���key��ȡ��valueֵ
    }
}