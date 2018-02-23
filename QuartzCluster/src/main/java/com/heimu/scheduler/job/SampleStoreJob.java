package com.heimu.scheduler.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class SampleStoreJob implements Job {

    private Log logger = LogFactory.getLog(SampleStoreJob.class);

    public void execute(JobExecutionContext context) throws JobExecutionException {
        logger.info("////////////////SampleStoreJob.execute()////////////////");
    }

}