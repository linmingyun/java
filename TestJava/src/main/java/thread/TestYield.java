package thread;

/**
 * Java�߳��е�Thread.yield( )��������Ϊ�߳��ò�������˼�壬
 * ����˵��һ���߳�ʹ�����������֮�����ͻ���Լ�CPUִ�е�ʱ���õ���
 * ���Լ������������߳����У�ע�������Լ����������߳����У������ǵ������ø������̡߳�
 * yield()���������ò��������õ�ǰ�߳��ɡ�����״̬�����뵽������״̬����
 * �Ӷ�������������ͬ���ȼ��ĵȴ��̻߳�ȡִ��Ȩ�����ǣ������ܱ�֤�ڵ�ǰ�̵߳���yield()֮��
 * ����������ͬ���ȼ����߳̾�һ���ܻ��ִ��Ȩ��Ҳ�п����ǵ�ǰ�߳��ֽ��뵽������״̬���������У�
 */
public class TestYield {

  public static void main(String[] args) {
    MyThread3 t1 = new MyThread3("t1");
    MyThread3 t2 = new MyThread3("t2");
    t1.start();
    t2.start();
  }
}

class MyThread3 extends Thread {

  MyThread3(String s) {
    super(s);
  }

  public void run() {
    for (int i = 1; i <= 100; i++) {
      System.out.println(getName() + ": " + i);
      if (i % 10 == 0) {
        yield();
      }
    }
  }
}
