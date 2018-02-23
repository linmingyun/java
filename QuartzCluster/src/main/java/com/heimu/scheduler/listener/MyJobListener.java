package com.heimu.scheduler.listener;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;

public class MyJobListener implements JobListener {

    //相当于为我们的监听器命名
    public String getName() {
        return "myJobListener";
    }

    public void jobToBeExecuted(JobExecutionContext context) {
        System.out.println(getName() + "触发对"+context.getJobDetail().getJobClass()+"的开始执行的监听工作，这里可以完成任务前的一些资源准备工作或日志记录");
    }

    //“否决JobDetail”是在Triiger被其相应的监听器监听时才具备的能力
    public void jobExecutionVetoed(JobExecutionContext context) {
        System.out.println("被否决执行了，可以做些日志记录。");
    }

    public void jobWasExecuted(JobExecutionContext context,
            JobExecutionException jobException) {
        System.out.println(getName() + "触发对"+context.getJobDetail().getJobClass()+"结束执行的监听工作，这里可以进行资源销毁工作或做一些新闻扒取结果的统计工作");

    }

}