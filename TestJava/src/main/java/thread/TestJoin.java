package thread;

/**
 * join() 的作用
 * 让父线程等待子线程结束之后才能继续运行。
 * 当我们调用某个线程的这个方法时，这个方法会挂起调用线程，
 * 直到被调用线程结束执行，调用线程才会继续执行。
 */
public class TestJoin {

  public static void main(String[] args) {
    MyThread2 t1 = new MyThread2("abcde");
    t1.start();
    try {
      t1.join();
    } catch (InterruptedException e) {
    }

    for (int i = 1; i <= 10; i++) {
      System.out.println("i am main thread");
    }
  }
}

class MyThread2 extends Thread {

  MyThread2(String s) {
    super(s);
  }

  public void run() {
    for (int i = 1; i <= 10; i++) {
      System.out.println("i am " + getName());
      try {
        sleep(1000);
      } catch (InterruptedException e) {
        return;
      }
    }
  }
}
