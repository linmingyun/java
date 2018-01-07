package pattern01.singleton.example5;

/**
 * Ҳ��������ʵ�֣���Ϊ����ֻ��Ҫ�ڴ������ʱ�����ͬ��������ֻҪ��������getInstance()�ֿ���
 * ����Ϊ������synchronized�ؼ��֣�Ҳ�ǿ��Եġ�
 * �������ܵĻ�����������ֻ�贴��һ��ʵ������������Ҳ������ʲôӰ�졣
 */
public class Singleton {

    private static Singleton instance = null;

    private Singleton() {
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new Singleton();
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }
}