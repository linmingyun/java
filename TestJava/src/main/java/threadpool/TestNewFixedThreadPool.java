package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//����һ�������̳߳أ��ɿ����߳���󲢷������������̻߳��ڶ����еȴ�
public class TestNewFixedThreadPool {
	public static void main(String[] args) {
		//�����̳߳صĴ�С��ø���ϵͳ��Դ�������á���Runtime.getRuntime().availableProcessors()
		System.out.println(Runtime.getRuntime().availableProcessors());
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
		for (int i = 0; i < 10; i++) {
			final int index = i;
			fixedThreadPool.execute(new Runnable() {
				public void run() {
					try {
						System.out.println(index);
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
		}
	}
}