package chapter07.notify;

/**
 * Ϊ������MissedNotify����Ҫ���һ��booleanָʾ�������ñ���ֻ����ͬ��������ڲ����ʺ��޸ġ�
 * ע������м���ע�͵Ĳ��֣���threadB����֪֮ͨǰ���Ƚ�okToProceed��Ϊtrue��
 * �������threadA��֪ͨ��©����ô�Ͳ������whileѭ����Ҳ�㲻��ִ��wait�������߳�Ҳ�Ͳ���������
 * ���֪ͨû�б���©��wait�������غ�okToProceed�Ѿ�����Ϊtrue��
 * �´�whileѭ���ж�����������������˳�ѭ����������ͨ����־λ��wait��notifyAll�����ʹ�ã�
 * �������֪ͨ��©����ɵ��������⡣
 * �ܽ᣺��ʹ���̵߳ĵȴ�/֪ͨ����ʱ��һ�㶼Ҫ���һ��boolean����ֵ�����������ܹ��ж���ٵ���������
 * ��notify֮ǰ�ı��boolean������ֵ����wait���غ��ܹ��˳�whileѭ��
 * ��һ�㶼Ҫ��wait������Χ��һ��whileѭ�����Է�ֹ����֪ͨ��������֪ͨ����©�󣬲��ᱻ������wait��������
 * �����㱣֤�˳������ȷ�ԡ�
 */
public class MissedNotifyFix extends Object {
    private Object proceedLock;
    //�ñ�־λ����ָʾ�߳��Ƿ���Ҫ�ȴ�
    private boolean okToProceed;

    public MissedNotifyFix() {
        print("in MissedNotify()");
        proceedLock = new Object();
        //������Ϊfalse
        okToProceed = false;
    }

    public void waitToProceed() throws InterruptedException {
        print("in waitToProceed() - entered");

        synchronized ( proceedLock ) {
            print("in waitToProceed() - entered sync block");
            //whileѭ���жϣ����ﲻ��if��ԭ����Ϊ�˷�ֹ����֪ͨ
            while ( okToProceed == false ) {
                print("in waitToProceed() - about to wait()");
                proceedLock.wait();
                print("in waitToProceed() - back from wait()");
            }

            print("in waitToProceed() - leaving sync block");
        }

        print("in waitToProceed() - leaving");
    }

    public void proceed() {
        print("in proceed() - entered");

        synchronized ( proceedLock ) {
            print("in proceed() - entered sync block");
            //֪֮ͨǰ����������Ϊtrue��������ʹ����֪ͨ��©�������Ҳ����ʹ�߳���wait������
            okToProceed = true;
            print("in proceed() - changed okToProceed to true");
            proceedLock.notifyAll();
            print("in proceed() - just did notifyAll()");

            print("in proceed() - leaving sync block");
        }

        print("in proceed() - leaving");
    }

    private static void print(String msg) {
        String name = Thread.currentThread().getName();
        System.out.println(name + ": " + msg);
    }

    public static void main(String[] args) {
        final MissedNotifyFix mnf = new MissedNotifyFix();

        Runnable runA = new Runnable() {
            public void run() {
                try {
                    //����1000ms������runB�е�500ms��
                    //��Ϊ�˺����waitToProceed���Ӷ���notifyAll����wait��
                    Thread.sleep(1000);
                    mnf.waitToProceed();
                } catch ( InterruptedException x ) {
                    x.printStackTrace();
                }
            }
        };

        Thread threadA = new Thread(runA, "threadA");
        threadA.start();

        Runnable runB = new Runnable() {
            public void run() {
                try {
                    //����500ms��С��runA�е�1000ms��
                    //��Ϊ���ȵ���proceed���Ӷ���notifyAll����wait��
                    Thread.sleep(500);
                    mnf.proceed();
                } catch ( InterruptedException x ) {
                    x.printStackTrace();
                }
            }
        };

        Thread threadB = new Thread(runB, "threadB");
        threadB.start();

        try {
            Thread.sleep(10000);
        } catch ( InterruptedException x ) {}

        print("about to invoke interrupt() on threadA");
        threadA.interrupt();
    }
}