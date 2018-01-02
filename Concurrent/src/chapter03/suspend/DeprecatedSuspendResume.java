package chapter03.suspend;

/**
 * Thread 的API中包含两个被淘汰的方法，它们用于临时挂起和重启某个线程，
 * 这些方法已经被淘汰，因为它们是不安全的，不稳定的。
 * 如果在不合适的时候挂起线程（比如，锁定共享资源时），
 * 此时便可能会发生死锁条件——其他线程在等待该线程释放锁，
 * 但该线程却被挂起了，便会发生死锁。
 * 另外，在长时间计算期间挂起线程也可能导致问题。
 * 下面的代码演示了通过休眠来延缓运行，模拟长时间运行的情况，
 * 使线程更可能在不适当的时候被挂起。
 * 从areValuesEqual（）返回的值有时为true，有时为false。
 * 以上代码中，在设置firstVal之后，但在设置secondVal之前，
 * 挂起新线程会产生麻烦，此时输出的结果会为false（情况1），
 * 这段时间不适宜挂起线程，但因为线程不能控制何时调用它的suspend方法，
 * 所以这种情况是不可避免的。
 * 当然，即使线程不被挂起（注释掉挂起和恢复线程的两行代码），
 * 如果在main线程中执行dsr.areValuesEqual（）进行比较时，
 * 恰逢stepOne操作执行完，而stepTwo操作还没执行，
 * 那么得到的结果同样可能是false（情况2）。
 */
public class DeprecatedSuspendResume extends Object implements Runnable{

    //volatile关键字，表示该变量可能在被一个线程使用的同时，被另一个线程修改
    private volatile int firstVal;
    private volatile int secondVal;

    //判断二者是否相等
    public boolean areValuesEqual(){
        return ( firstVal == secondVal);
    }

    public void run() {
        try{
            firstVal = 0;
            secondVal = 0;
            workMethod();
        }catch(InterruptedException x){
            System.out.println("interrupted while in workMethod()");
        }
    }

    private void workMethod() throws InterruptedException {
        int val = 1;
        while (true){
            stepOne(val);
            stepTwo(val);
            val++;
            Thread.sleep(200);  //再次循环前休眠200毫秒
        }
    }

    //赋值后，休眠300毫秒，从而使线程有机会在stepOne操作和stepTwo操作之间被挂起
    private void stepOne(int newVal) throws InterruptedException{
        firstVal = newVal;
        Thread.sleep(300);  //模拟长时间运行的情况
    }

    private void stepTwo(int newVal){
        secondVal = newVal;
    }

    public static void main(String[] args){
        DeprecatedSuspendResume dsr = new DeprecatedSuspendResume();
        Thread t = new Thread(dsr);
        t.start();

        //休眠1秒，让其他线程有机会获得执行
        try {
            Thread.sleep(1000);}
        catch(InterruptedException x){}
        for (int i = 0; i < 10; i++){
            //挂起线程
            t.suspend();
            System.out.println("dsr.areValuesEqual()=" + dsr.areValuesEqual());
            //恢复线程
            t.resume();
            try{
                //线程随机休眠0~2秒
                Thread.sleep((long)(Math.random()*2000.0));
            }catch(InterruptedException x){
                //略
            }
        }
        System.exit(0); //中断应用程序
    }
}