package chapter13;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * һ�鲢������
 */
class SubTask extends Thread {
    private String name;
    private CyclicBarrier cb;

    SubTask(String name, CyclicBarrier cb) {
        this.name = name;
        this.cb = cb;
    }

    public void run() {
        System.out.println("[��������" + name + "]  ��ʼִ��");
        for (int i = 0; i < 999999; i++) ;    //ģ���ʱ������
        System.out.println("[��������" + name + "]  ִ����ϣ�֪ͨ�ϰ���");
        try {
            //ÿִ����һ�������֪ͨ�ϰ���
            cb.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}