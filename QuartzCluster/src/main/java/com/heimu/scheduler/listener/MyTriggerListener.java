package com.heimu.scheduler.listener;

import org.quartz.JobExecutionContext;
import org.quartz.Trigger;
import org.quartz.Trigger.CompletedExecutionInstruction;
import org.quartz.TriggerListener;

public class MyTriggerListener implements TriggerListener {

    public String getName() {
        return "myTriggerListener";
    }

    public void triggerFired(Trigger trigger, JobExecutionContext context) {
        System.out.println(" Trigger �������ˣ���ʱJob �ϵ� execute() ������Ҫ��ִ��");
    }

    public boolean vetoJobExecution(Trigger trigger, JobExecutionContext context) {
        System.out.println("���ִ˴�Job�������Դ׼���������⣬����չ�����񣬷���true��ʾ����˴�����ִ��");
        return true;
    }

    public void triggerMisfired(Trigger trigger) {
        System.out.println( "��ǰTrigger���������");
    }

    //����2.+�汾�����ã�������ڽ�triggerInstructionCode�����͸ĳ���ö������
    public void triggerComplete(Trigger trigger, JobExecutionContext context,
            CompletedExecutionInstruction triggerInstructionCode) {
        System.out.println("Trigger ��������������� Job ��ִ��,�˷���������");
    }
}