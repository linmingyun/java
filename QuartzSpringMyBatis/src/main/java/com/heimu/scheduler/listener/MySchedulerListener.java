package com.heimu.scheduler.listener;

import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.SchedulerException;
import org.quartz.SchedulerListener;
import org.quartz.Trigger;
import org.quartz.TriggerKey;

public class MySchedulerListener implements SchedulerListener {

    public void jobScheduled(Trigger trigger) {
        System.out.println("���񱻲���ʱ��ִ��");
    }

    public void jobUnscheduled(TriggerKey triggerKey) {
        System.out.println("����ж��ʱ��ִ��");
    }

    public void triggerFinalized(Trigger trigger) {
        System.out.println("�������������ʹ������������ʱ��ִ��");
    }

    public void triggerPaused(TriggerKey triggerKey) {
        System.out.println(triggerKey + "��һ��������������ͣʱ��ִ��");
    }

    public void triggersPaused(String triggerGroup) {
        System.out.println(triggerGroup + "�������ȫ����������ֹͣʱ��ִ��");
    }

    public void triggerResumed(TriggerKey triggerKey) {
        System.out.println(triggerKey + "��һ�������������ָ�ʱ��ִ��");
    }

    public void triggersResumed(String triggerGroup) {
        System.out.println(triggerGroup + "�������ȫ�����������ظ�ʱ��ִ��");
    }

    public void jobAdded(JobDetail jobDetail) {
        System.out.println("һ��JobDetail����̬��ӽ���");
    }

    public void jobDeleted(JobKey jobKey) {
        System.out.println(jobKey + "��ɾ��ʱ��ִ��");
    }

    public void jobPaused(JobKey jobKey) {
        System.out.println(jobKey + "����ͣʱ��ִ��");

    }

    public void jobsPaused(String jobGroup) {
        System.out.println(jobGroup + "(һ�����񣩱���ͣʱ��ִ��");
    }

    public void jobResumed(JobKey jobKey) {
        System.out.println(jobKey + "���ָ�ʱ��ִ��");
    }

    public void jobsResumed(String jobGroup) {
        System.out.println(jobGroup + "(һ�����񣩱��ظ�ʱ��ִ��");
    }

    public void schedulerError(String msg, SchedulerException cause) {
        System.out.println("�����쳣" + msg + "ʱ��ִ��");
        cause.printStackTrace();
    }

    public void schedulerInStandbyMode() {
        System.out.println("scheduler����ΪstandBy�Ⱥ�ģʽʱ��ִ��");

    }

    public void schedulerStarted() {
        System.out.println("scheduler����ʱ��ִ��");

    }

    public void schedulerStarting() {
        System.out.println("scheduler��������ʱ��ִ��");

    }

    public void schedulerShutdown() {
        System.out.println("scheduler�ر�ʱ��ִ��");
    }

    public void schedulerShuttingdown() {
        System.out.println("scheduler���ڹر�ʱ��ִ��");

    }

    public void schedulingDataCleared() {
        System.out.println("scheduler���������ݰ���jobs, triggers��calendars�������ʱ��ִ��");
    }

}