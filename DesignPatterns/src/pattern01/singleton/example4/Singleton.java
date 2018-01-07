package pattern01.singleton.example4;

/**
 * ʵ������ǣ�����ģʽʹ���ڲ�����ά��������ʵ�֣�JVM�ڲ��Ļ����ܹ���֤��һ���౻���ص�ʱ��
 * �����ļ��ع������̻߳���ġ����������ǵ�һ�ε���getInstance��ʱ��
 * JVM�ܹ������Ǳ�֤instanceֻ������һ�Σ����һᱣ֤�Ѹ�ֵ��instance���ڴ��ʼ����ϣ�
 * �������ǾͲ��õ�����������⡣ͬʱ�÷���Ҳֻ���ڵ�һ�ε��õ�ʱ��ʹ�û�����ƣ������ͽ���˵��������⡣
 * ����������ʱ�ܽ�һ�������ĵ���ģʽ
 * ��ʵ˵��������Ҳ��һ��������ڹ��캯�����׳��쳣��ʵ������Զ�ò���������Ҳ�����
 * ����˵��ʮ�������Ķ�����û�еģ�����ֻ�ܸ���ʵ�������ѡ�����ʺ��Լ�Ӧ�ó�����ʵ�ַ�����
 */
public class Singleton {

    /* ˽�й��췽������ֹ��ʵ���� */
    private Singleton() {
    }

    /* �˴�ʹ��һ���ڲ�����ά������ */
    private static class SingletonFactory {
        private static Singleton instance = new Singleton();
    }

    /* ��ȡʵ�� */
    public static Singleton getInstance() {
        return SingletonFactory.instance;
    }

    /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */
    public Object readResolve() {
        return getInstance();
    }
}