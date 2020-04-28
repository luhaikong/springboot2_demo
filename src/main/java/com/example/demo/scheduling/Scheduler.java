package com.example.demo.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 调度 是执行特定时间段的任务的过程
 * 使用方法：在DemoApplication。java类里面添加注解即可【@EnableScheduling】
 */
@Component
public class Scheduler {

    /**
     * 从服务启动开始计时，每隔一分钟执行一次cron作业调度程序任务
     * 在每天上午13:00点到上午13:59期间的每1分钟触发
     */
    @Scheduled(cron = "0 * 13 * * ?")
    public void cronJobSch() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date now = new Date();
        String strDate = sdf.format(now);
        System.out.println("Java cron job expression:: " + strDate);
    }
}
