package pattern06.adapter.objectadapter;

import pattern06.adapter.classadapter.Source;
import pattern06.adapter.classadapter.Targetable;

/**
 * �����������ģʽ
 * ����˼·�����������ģʽ��ͬ��ֻ�ǽ�Adapter�����޸ģ���β��̳�Source�࣬
 * ���ǳ���Source���ʵ�����Դﵽ��������Ե����⡣
 * ������һ��һ����ֻ������ķ�����ͬ���ѡ�
 */
public class AdapterTest {

    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();
    }
}