package chapter12.blocking;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * ����������Java 5�����������е����ݣ��������еĽӿ���java.util.concurrent.BlockingQueue��
 * ���ж��ʵ���ࣺArrayBlockingQueue��DelayQueue��LinkedBlockingQueue��
 * PriorityBlockingQueue��SynchronousQueue�ȣ��÷���ͬС�죬����ɲ鿴JDK�ĵ���
 * ����򵥾�������ArrayBlockingQueue����ʵ����һ���н���У���������ʱ����������ȴ���
 * ֱ����Ԫ�س��ӣ�������Ԫ�زſ��Ա�������С�
 * �ӽ���п��Կ�����������˵�20��Ԫ�غ����ǴӶ����Ƴ�һ��Ԫ�أ�
 * ��������Լ�������������Ԫ�أ�֮��ÿ���һ��Ԫ�أ�
 * ��ӽ�����Ԫ���Ƴ���������������ִ�н�����
 */
public class BlockingQueueTest{
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bqueue = new ArrayBlockingQueue<String>(20);
        for (int i = 0; i < 30; i++) {
            //��ָ��Ԫ����ӵ��˶�����
            bqueue.put("" + i);
            System.out.println("�����������������Ԫ��:" + i);
            if(i > 18){
                //�Ӷ����л�ȡ��ͷԪ�أ��������Ƴ�����
                System.out.println("�������������Ƴ�Ԫ�أ�" + bqueue.take());
            }
        }
        System.out.println("���򵽴����н����������˳�----");
    }
}