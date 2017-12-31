package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//����ʹ��JDK�Դ��ļ�ع�����������Ǵ������߳�����������һ������ֹ���̣߳�����ָ�������̣߳����۲죺
//����Ŀ¼��C:\Program Files\Java\jdk1.6.0_06\bin\jconsole.exe
public class TestNewCachedThreadPool2 {
	public static void main(String[] args) {
		ExecutorService singleThreadExecutor = Executors.newCachedThreadPool();
		for (int i = 0; i < 100; i++) {
			final int index = i;
			singleThreadExecutor.execute(new Runnable() {
				public void run() {
					try {
						while (true) {
							System.out.println(index);
							Thread.sleep(10 * 1000);
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}