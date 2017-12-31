package thread;

public class TestThread7 {
	private int j;

	public static void main(String args[]) {
		TestThread7 tt = new TestThread7();
		Inc inc = tt.new Inc();
		Dec dec = tt.new Dec();
		for (int i = 0; i < 2; i++) {//����4���߳�
			Thread t = new Thread(inc);//����һ����j��1���߳�
			t.start();
			t = new Thread(dec);//����һ����j��1���߳�
			t.start();
		}
	}

	private synchronized void inc() {//ÿ�ζ�j��1
		j++;
		System.out.println(Thread.currentThread().getName() + "-inc:" + j);
	}

	private synchronized void dec() {//ÿ�ζ�j��1
		j--;
		System.out.println(Thread.currentThread().getName() + "-dec:" + j);
	}

	class Inc implements Runnable {
		public void run() {
			for (int i = 0; i < 100; i++) {
				inc();
			}
		}
	}

	class Dec implements Runnable {
		public void run() {
			for (int i = 0; i < 100; i++) {
				dec();
			}
		}
	}

}