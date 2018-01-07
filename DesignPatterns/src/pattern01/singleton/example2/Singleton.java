package pattern01.singleton.example2;

public class Singleton {

    /* ����˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull��Ŀ����ʵ���ӳټ��� */
    private static Singleton instance = null;

    /* ˽�й��췽������ֹ��ʵ���� */
    private Singleton() {
    }

    /**
     * ���ǣ�synchronized�ؼ�����ס������������������÷����������ϻ������½���
     * ��Ϊÿ�ε���getInstance()����Ҫ�Զ�����������ʵ�ϣ�ֻ���ڵ�һ�δ��������ʱ����Ҫ������
     * ֮��Ͳ���Ҫ�ˣ����ԣ�����ط���Ҫ�Ľ���
     */
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */
    public Object readResolve() {
        return instance;
    }
}