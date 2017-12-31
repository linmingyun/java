package thread;

public class TestThread7 {
	private int j;

	public static void main(String args[]) {
		TestThread7 tt = new TestThread7();
		Inc inc = tt.new Inc();
		Dec dec = tt.new Dec();
		for (int i = 0; i < 2; i++) {//创建4个线程
			Thread t = new Thread(inc);//创建一个对j加1的线程
			t.start();
			t = new Thread(dec);//创建一个对j减1的线程
			t.start();
		}
	}

	private synchronized void inc() {//每次对j加1
		j++;
		System.out.println(Thread.currentThread().getName() + "-inc:" + j);
	}

	private synchronized void dec() {//每次对j减1
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