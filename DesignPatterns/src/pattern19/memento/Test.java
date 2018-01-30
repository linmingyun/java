package pattern19.memento;

/**
 * ��ҪĿ���Ǳ���һ�������ĳ��״̬���Ա����ʵ���ʱ��ָ����󣬸��˾��ýб���ģʽ������Щ��
 * ͨ�׵Ľ��£�������ԭʼ��A��A���и������ԣ�A���Ծ�����Ҫ���ݵ����ԣ�����¼��B�������洢A��һЩ�ڲ�״̬��
 * ��C�أ�����һ�������洢����¼�ģ���ֻ�ܴ洢�������޸ĵȲ�����
 * Original����ԭʼ�࣬��������Ҫ���������value������һ������¼�࣬��������valueֵ��
 * Memento���Ǳ���¼�࣬Storage���Ǵ洢����¼���࣬����Memento���ʵ����
 * ��ʵ�Ҿ������ģʽ�С�����-�ָ���ģʽ������
 */
public class Test {

    public static void main(String[] args) {

        // ����ԭʼ��
        Original origi = new Original("egg");

        // ��������¼
        Storage storage = new Storage(origi.createMemento());

        // �޸�ԭʼ���״̬
        System.out.println("��ʼ��״̬Ϊ��" + origi.getValue());
        origi.setValue("niu");
        System.out.println("�޸ĺ��״̬Ϊ��" + origi.getValue());

        // �ظ�ԭʼ���״̬
        origi.restoreMemento(storage.getMemento());
        System.out.println("�ָ����״̬Ϊ��" + origi.getValue());
    }
}