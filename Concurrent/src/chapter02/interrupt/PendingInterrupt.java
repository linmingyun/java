package chapter02.interrupt;

/**
 * 如果PendingInterrupt不带任何命令行参数，那么线程不会被中断，
 * 最终输出的时间差距应该在2000附近（具体时间由系统决定，不精确），
 * 如果PendingInterrupt带有命令行参数，则调用中断当前线程的代码，
 * 但main线程仍然运行，最终输出的时间差距应该远小于2000，
 * 因为线程尚未休眠，便被中断，因此，一旦调用sleep()方法，
 * 会立即打印出catch块中的信息。
 * 如果PendingInterrupt带命令行参数，main线程中断它自身。
 * 除了将中断标志（它是Thread的内部标志）设置为true外，没有其他任何影响。
 * 线程被中断了，但main线程仍然运行，main线程继续监视实时时钟，
 * 并进入try块，一旦调用sleep()方法，它就会注意到待决中断的存在，
 * 并抛出InterruptException。于是执行跳转到catch块，并打印出线程被中断的信息。
 * 最后，计算并打印出时间差。
 */
public class PendingInterrupt extends Object {
    public static void main(String[] args){
        //如果输入了参数，则在mian线程中中断当前线程（亦即main线程）
        if( args.length > 0 ){
            Thread.currentThread().interrupt();
        }
        //获取当前时间
        long startTime = System.currentTimeMillis();
        try{
            Thread.sleep(2000);
            System.out.println("was NOT interrupted");
        }catch(InterruptedException x){
            System.out.println("was interrupted");
        }
        //计算中间代码执行的时间
        System.out.println("elapsedTime=" + ( System.currentTimeMillis() - startTime));
    }
}