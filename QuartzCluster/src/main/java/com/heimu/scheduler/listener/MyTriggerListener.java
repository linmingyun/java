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
        System.out.println(" Trigger 被触发了，此时Job 上的 execute() 方法将要被执行");
    }

    public boolean vetoJobExecution(Trigger trigger, JobExecutionContext context) {
        System.out.println("发现此次Job的相关资源准备存在问题，不便展开任务，返回true表示否决此次任务执行");
        return true;
    }

    public void triggerMisfired(Trigger trigger) {
        System.out.println( "当前Trigger触发错过了");
    }

    //这是2.+版本的配置，差别在于将triggerInstructionCode从整型改成了枚举类型
    public void triggerComplete(Trigger trigger, JobExecutionContext context,
            CompletedExecutionInstruction triggerInstructionCode) {
        System.out.println("Trigger 被触发并且完成了 Job 的执行,此方法被调用");
    }
}