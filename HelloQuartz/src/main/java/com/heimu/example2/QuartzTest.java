package com.heimu.example2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class QuartzTest {
    public static void main(String[] args) {
        try {
            String jobName = "动态任务调度";
            System.out.println("【任务启动】开始(每10秒输出一次)...");
            QuartzManager.addJob(jobName, QuartzJob.class, "0/10 * * * * ?");
            Thread.sleep(5000);
            System.out.println("【修改时间】开始(每2秒输出一次)...");
            QuartzManager.modifyJobTime(jobName, "10/2 * * * * ?");
            Thread.sleep(6000);
            System.out.println("【移除定时】开始...");
            QuartzManager.removeJob(jobName);
            System.out.println("【移除定时】成功");
            System.out.println("【再次添加定时任务】开始(每10秒输出一次)...");
            QuartzManager.addJob(jobName, QuartzJob.class, "*/10 * * * * ?");
            Thread.sleep(60000);
            System.out.println("【移除定时】开始...");
            QuartzManager.removeJob(jobName);
            System.out.println("【移除定时】成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String formatDateByPattern(Date date,String dateFormat){
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        String formatTimeStr = null;
        if (date != null) {
            formatTimeStr = sdf.format(date);
        }
        return formatTimeStr;
    }

    public static String getCron(java.util.Date  date){
        String dateFormat="ss mm HH dd MM ? yyyy";
        return formatDateByPattern(date, dateFormat);
    }
}

/*
常用的时间配置：
格式: [秒] [分] [小时] [日] [月] [周] [年]
0 0 12 * * ?           每天12点触发
0 15 10 ? * *          每天10点15分触发
0 15 10 * * ?          每天10点15分触发
0 15 10 * * ? *        每天10点15分触发
0 15 10 * * ? 2005     2005年每天10点15分触发
0 * 14 * * ?           每天下午的 2点到2点59分每分触发
0 0/5 14 * * ?         每天下午的 2点到2点59分(整点开始，每隔5分触发)
0 0/5 14,18 * * ?        每天下午的 18点到18点59分(整点开始，每隔5分触发)

0 0-5 14 * * ?            每天下午的 2点到2点05分每分触发
0 10,44 14 ? 3 WED        3月分每周三下午的 2点10分和2点44分触发
0 15 10 ? * MON-FRI       从周一到周五每天上午的10点15分触发
0 15 10 15 * ?            每月15号上午10点15分触发
0 15 10 L * ?             每月最后一天的10点15分触发
0 15 10 ? * 6L            每月最后一周的星期五的10点15分触发
0 15 10 ? * 6L 2002-2005  从2002年到2005年每月最后一周的星期五的10点15分触发

0 15 10 ? * 6#3           每月的第三周的星期五开始触发
0 0 12 1/5 * ?            每月的第一个中午开始每隔5天触发一次
0 11 11 11 11 ?           每年的11月11号 11点11分触发(光棍节)
*/