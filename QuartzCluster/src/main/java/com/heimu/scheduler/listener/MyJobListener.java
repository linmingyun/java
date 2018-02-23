package com.heimu.scheduler.listener;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;

public class MyJobListener implements JobListener {

    //�൱��Ϊ���ǵļ���������
    public String getName() {
        return "myJobListener";
    }

    public void jobToBeExecuted(JobExecutionContext context) {
        System.out.println(getName() + "������"+context.getJobDetail().getJobClass()+"�Ŀ�ʼִ�еļ�����������������������ǰ��һЩ��Դ׼����������־��¼");
    }

    //�����JobDetail������Triiger������Ӧ�ļ���������ʱ�ž߱�������
    public void jobExecutionVetoed(JobExecutionContext context) {
        System.out.println("�����ִ���ˣ�������Щ��־��¼��");
    }

    public void jobWasExecuted(JobExecutionContext context,
            JobExecutionException jobException) {
        System.out.println(getName() + "������"+context.getJobDetail().getJobClass()+"����ִ�еļ���������������Խ�����Դ���ٹ�������һЩ���Ű�ȡ�����ͳ�ƹ���");

    }

}