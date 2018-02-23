package com.heimu.scheduler.listener;

import org.quartz.*;

public class MySchedulerListener implements SchedulerListener {

    public void jobScheduled(Trigger trigger) {
        System.out.println("任务被部署时被执行");
    }

    public void jobUnscheduled(TriggerKey triggerKey) {
        System.out.println("任务被卸载时被执行");
    }

    public void triggerFinalized(Trigger trigger) {
        System.out.println("任务完成了它的使命，光荣退休时被执行");
    }

    public void triggerPaused(TriggerKey triggerKey) {
        System.out.println(triggerKey + "（一个触发器）被暂停时被执行");
    }

    public void triggersPaused(String triggerGroup) {
        System.out.println(triggerGroup + "所在组的全部触发器被停止时被执行");
    }

    public void triggerResumed(TriggerKey triggerKey) {
        System.out.println(triggerKey + "（一个触发器）被恢复时被执行");
    }

    public void triggersResumed(String triggerGroup) {
        System.out.println(triggerGroup + "所在组的全部触发器被回复时被执行");
    }

    public void jobAdded(JobDetail jobDetail) {
        System.out.println("一个JobDetail被动态添加进来");
    }

    public void jobDeleted(JobKey jobKey) {
        System.out.println(jobKey + "被删除时被执行");
    }

    public void jobPaused(JobKey jobKey) {
        System.out.println(jobKey + "被暂停时被执行");

    }

    public void jobsPaused(String jobGroup) {
        System.out.println(jobGroup + "(一组任务）被暂停时被执行");
    }

    public void jobResumed(JobKey jobKey) {
        System.out.println(jobKey + "被恢复时被执行");
    }

    public void jobsResumed(String jobGroup) {
        System.out.println(jobGroup + "(一组任务）被回复时被执行");
    }

    public void schedulerError(String msg, SchedulerException cause) {
        System.out.println("出现异常" + msg + "时被执行");
        cause.printStackTrace();
    }

    public void schedulerInStandbyMode() {
        System.out.println("scheduler被设为standBy等候模式时被执行");

    }

    public void schedulerStarted() {
        System.out.println("scheduler启动时被执行");

    }

    public void schedulerStarting() {
        System.out.println("scheduler正在启动时被执行");

    }

    public void schedulerShutdown() {
        System.out.println("scheduler关闭时被执行");
    }

    public void schedulerShuttingdown() {
        System.out.println("scheduler正在关闭时被执行");

    }

    public void schedulingDataCleared() {
        System.out.println("scheduler中所有数据包括jobs, triggers和calendars都被清空时被执行");
    }

}