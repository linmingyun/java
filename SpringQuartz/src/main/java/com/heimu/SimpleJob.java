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
        System.out.println("现在时间为："+new Date());
        //可以通过上下文获取到JobDataMap，这里面可以存放一些参数类型的数据
        JobDataMap dataMap=arg0.getMergedJobDataMap();
        String wish=(String) dataMap.get("wish");
        System.out.println(wish);
    }
}