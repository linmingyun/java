package com.heimu;

import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

public class SimpleJob extends QuartzJobBean {

    @Override
    protected void executeInternal(JobExecutionContext arg0)
            throws JobExecutionException {
        System.out.println("����ʱ��Ϊ��"+new Date());
        //����ͨ�������Ļ�ȡ��JobDataMap����������Դ��һЩ�������͵�����
        JobDataMap dataMap=arg0.getMergedJobDataMap();
        String wish=(String) dataMap.get("wish");
        System.out.println(wish);
    }
}