package chapter13;

/**
 * 最后执行的任务
 */
class MainTask implements Runnable {
    public void run() {
        System.out.println("......终于要执行最后的任务了......");
    }
}