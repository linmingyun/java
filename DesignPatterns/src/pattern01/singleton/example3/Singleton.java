package pattern01.singleton.example3;

public class Singleton {

    /* ����˽�о�̬ʵ������ֹ�����ã��˴���ֵΪnull��Ŀ����ʵ���ӳټ��� */
    private static Singleton instance = null;

    /* ˽�й��췽������ֹ��ʵ���� */
    private Singleton() {
    }

    /**
     * �ƺ������֮ǰ�ᵽ�����⣬��synchronized�ؼ��ּ������ڲ���Ҳ����˵�����õ�ʱ���ǲ���Ҫ�����ģ�
     * ֻ����instanceΪnull�������������ʱ�����Ҫ������������һ�������������ǣ������������
     * �����п���������ģ���������������Javaָ���д�������͸�ֵ�����Ƿֿ����еģ�
     * Ҳ����˵instance = new Singleton();����Ƿ�����ִ�еġ�����JVM������֤�������������Ⱥ�˳��
     * Ҳ����˵�п���JVM��Ϊ�µ�Singletonʵ������ռ䣬Ȼ��ֱ�Ӹ�ֵ��instance��Ա��
     * Ȼ����ȥ��ʼ�����Singletonʵ���������Ϳ��ܳ����ˣ�������A��B�����߳�Ϊ����
     * a>A��B�߳�ͬʱ�����˵�һ��if�ж�
     * b>A���Ƚ���synchronized�飬����instanceΪnull��������ִ��instance = new Singleton();
     * c>����JVM�ڲ����Ż����ƣ�JVM�Ȼ�����һЩ�����Singletonʵ���Ŀհ��ڴ棬
     * ����ֵ��instance��Ա��ע���ʱJVMû�п�ʼ��ʼ�����ʵ������Ȼ��A�뿪��synchronized�顣
     * d>B����synchronized�飬����instance��ʱ����null��
     * ����������뿪��synchronized�鲢��������ظ����ø÷����ĳ���
     * e>��ʱB�̴߳���ʹ��Singletonʵ����ȴ������û�б���ʼ�������Ǵ������ˡ�
     * ���Գ������п��ܷ���������ʵ���������й����Ǻܸ��ӵģ���������ǾͿ��Կ�����
     * ��������д���̻߳����µĳ�������Ѷȣ�����ս�ԡ�
     */
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */
    public Object readResolve() {
        return instance;
    }
}