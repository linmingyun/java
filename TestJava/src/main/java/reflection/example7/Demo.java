package reflection.example7;

import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * ͨ������Խ�����ͼ��
 *
 * ���磺��һ��String���͵ļ��ϣ���������������������һ��Integer���͵�ֵ��
 */
public class Demo {
    public static void main(String[] args) throws Exception{
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("aaa");
        strList.add("bbb");

        //��ȡArrayList��Class���󣬷���ĵ���add()�������������
        Class listClass = strList.getClass(); //�õ� strList ������ֽ������
        //��ȡadd()����
        Method m = listClass.getMethod("add", Object.class);
        //����add()����
        m.invoke(strList, 100);

        //��������
        for(Object obj : strList){
            System.out.println(obj);
        }
    }
}