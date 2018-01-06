package chapter13;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * CyclicBarrier（又叫障碍器）同样是Java 5中加入的新特性，
 * 使用时需要导入java.util.concurrent.CylicBarrier。
 * 它适用于这样一种情况：你希望创建一组任务，它们并发地执行工作，
 * 另外的一个任务在这一组任务并发执行结束前一直阻塞等待，
 * 直到该组任务全部执行结束，这个任务才得以执行。
 * 这非常像CountDownLatch，只是CountDownLatch是只触发一次的事件，
 * 而CyclicBarrier可以多次重用。
 */
public class CyclicBarrierTest {
    public static void main(String[] args) {
        //创建CyclicBarrier对象，
        //并设置执行完一组5个线程的并发任务后，再执行MainTask任务
        CyclicBarrier cb = new CyclicBarrier(5, new MainTask());
        new SubTask("A", cb).start();
        new SubTask("B", cb).start();
        new SubTask("C", cb).start();
        new SubTask("D", cb).start();
        new SubTask("E", cb).start();
    }
}