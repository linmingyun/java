package chapter14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * �ڲ���ϵͳ�У��ź����Ǹ�����Ҫ�ĸ�����ڿ��ƽ��̼��Э���������ŷǳ���Ҫ�����ã�
 * ͨ�����ź����Ĳ�ͬ���������Էֱ�ʵ�ֽ��̼�Ļ�����ͬ������Ȼ��Ҳ�������ڶ��̵߳Ŀ��ƣ�
 * ������ȫ����ͨ��ʹ���ź������Զ���ʵ������Java�е�synchronized��wait��notify���ơ�
 * Java�������е��ź���Semaphoreʵ������һ��������ϵļ����ź������Ӹ����Ͻ�����ά����һ����ɼ��ϣ�
 * �Կ���һ����Դ��������������ź���Ҫ�����塣Semaphore���Կ���ĳ����Դ��ͬʱ���ʵ���������
 * ��ͨ��acquire������ȡһ����ɣ�release�����ͷ�һ����ɡ������ͬʱ���ʵ�������������
 * ������acquire���������ȴ�״̬��ֱ����һ������release���������ܵõ���ɡ�
 * ���Կ�����Semaphore���������ʵ�������һֱΪ5����Ȼ�����ﻹ�����׿���һ�㣬
 * ����Semaphore�����Ƕ���Դ�Ĳ������ʵ����������м�أ������ᱣ֤�̰߳�ȫ��
 * ��ˣ��ڷ��ʵ�ʱ��Ҫ�Լ������̵߳İ�ȫ���ʡ�
 */
public class SemaphoreTest{
    public static void main(String[] args) {
        //�����������������͹����̡߳����ڲ�ʹ���̳߳�
        ExecutorService exec = Executors.newCachedThreadPool();
        //ֻ����5���߳�ͬʱ����
        final Semaphore semp = new Semaphore(5);
        //ģ��10���ͻ��˷���
        for (int index = 0; index < 10; index++){
            final int num = index;
            Runnable run = new Runnable() {
                public void run() {
                    try {
                        //��ȡ���
                        semp.acquire();
                        System.out.println("�߳�" +
                                Thread.currentThread().getName() + "�����ɣ�"  + num);
                        //ģ���ʱ������
                        for (int i = 0; i < 999999; i++) ;
                        //�ͷ����
                        semp.release();
                        System.out.println("�߳�" +
                                Thread.currentThread().getName() + "�ͷ���ɣ�"  + num);
                        System.out.println("��ǰ�����������������" +
                                semp.availablePermits());
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }
                }
            };
            exec.execute(run);
        }
        //�ر��̳߳�
        exec.shutdown();
    }
}