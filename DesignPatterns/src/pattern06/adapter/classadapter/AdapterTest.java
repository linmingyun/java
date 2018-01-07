package pattern06.adapter.classadapter;

/**
 * ������ģʽ��ĳ����Ľӿ�ת���ɿͻ�����������һ���ӿڱ�ʾ��Ŀ�����������ڽӿڲ�ƥ������ɵ���ļ��������⡣
 * ��Ҫ��Ϊ���ࣺ���������ģʽ�������������ģʽ���ӿڵ�������ģʽ�����ȣ��������������������ģʽ��
 * ����˼����ǣ���һ��Source�࣬ӵ��һ�������������䣬Ŀ��ӿ�ʱTargetable��
 * ͨ��Adapter�࣬��Source�Ĺ�����չ��Targetable�
 * Adapter��̳�Source�࣬ʵ��Targetable�ӿڡ�
 * ����Targetable�ӿڵ�ʵ����;�����Source��Ĺ��ܡ�
 */
public class AdapterTest {

    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}