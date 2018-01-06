package chapter13;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * CyclicBarrier���ֽ��ϰ�����ͬ����Java 5�м���������ԣ�
 * ʹ��ʱ��Ҫ����java.util.concurrent.CylicBarrier��
 * ������������һ���������ϣ������һ���������ǲ�����ִ�й�����
 * �����һ����������һ�����񲢷�ִ�н���ǰһֱ�����ȴ���
 * ֱ����������ȫ��ִ�н������������ŵ���ִ�С�
 * ��ǳ���CountDownLatch��ֻ��CountDownLatch��ֻ����һ�ε��¼���
 * ��CyclicBarrier���Զ�����á�
 */
public class CyclicBarrierTest {
    public static void main(String[] args) {
        //����CyclicBarrier����
        //������ִ����һ��5���̵߳Ĳ����������ִ��MainTask����
        CyclicBarrier cb = new CyclicBarrier(5, new MainTask());
        new SubTask("A", cb).start();
        new SubTask("B", cb).start();
        new SubTask("C", cb).start();
        new SubTask("D", cb).start();
        new SubTask("E", cb).start();
    }
}