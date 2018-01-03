package chapter07.notify;

/**
 * notify通知的遗漏很容易理解，即threadA还没开始wait的时候，threadB已经notify了，
 * 这样，threadB通知是没有任何响应的，当threadB退出synchronized代码块后，
 * threadA再开始wait，便会一直阻塞等待，直到被别的线程打断。
 *
 * 分析：由于threadB在执行mn.proceed（）之前只休眠了500ms，
 * 而threadA在执行mn.waitToProceed（）之前休眠了1000ms，因此，threadB会先苏醒，
 * 继而执行mn.proceed（），获取到proceedLock的对象锁，继而执行其中的notifyAll（），
 * 当退出proceed（）方法中的synchronized代码块时，threadA才有机会获取proceedLock的对象锁，
 * 继而执行其中的wait（）方法，但此时notifyAll（）方法已经执行完毕，
 * threadA便漏掉了threadB的通知，便会阻塞下去。后面主线程休眠10秒后，
 * 尝试中断threadA线程，使其抛出InterruptedException。
 */
public class MissedNotify extends Object {
    private Object proceedLock;

    public MissedNotify() {
        print("in MissedNotify()");
        proceedLock = new Object();
    }

    public void waitToProceed() throws InterruptedException {
        print("in waitToProceed() - entered");

        synchronized ( proceedLock ) {
            print("in waitToProceed() - about to wait()");
            proceedLock.wait();
            print("in waitToProceed() - back from wait()");
        }

        print("in waitToProceed() - leaving");
    }

    public void proceed() {
        print("in proceed() - entered");

        synchronized ( proceedLock ) {
            print("in proceed() - about to notifyAll()");
            proceedLock.notifyAll();
            print("in proceed() - back from notifyAll()");
        }

        print("in proceed() - leaving");
    }

    private static void print(String msg) {
        String name = Thread.currentThread().getName();
        System.out.println(name + ": " + msg);
    }

    public static void main(String[] args) {
        final MissedNotify mn = new MissedNotify();

        Runnable runA = new Runnable() {
            public void run() {
                try {
                    //休眠1000ms，大于runB中的500ms，
                    //是为了后调用waitToProceed，从而先notifyAll，后wait，
                    //从而造成通知的遗漏
                    Thread.sleep(1000);
                    mn.waitToProceed();
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
                    //休眠500ms，小于runA中的1000ms，
                    //是为了先调用proceed，从而先notifyAll，后wait，
                    //从而造成通知的遗漏
                    Thread.sleep(500);
                    mn.proceed();
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

        //试图打断wait阻塞
        print("about to invoke interrupt() on threadA");
        threadA.interrupt();
    }
}