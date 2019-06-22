package com.taskscheduler;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledTS {
private static final SimpleDateFormat dataFormat = new SimpleDateFormat("HH:mm:ss");

@Scheduled(fixedRate = 2000)          //声明这是一个计划任务。使用fixedRate来实现每隔一段时间执行一次任务
public void reportCurrentTime() {
	System.out.println("execute every 2 seconds " + dataFormat.format(new Date()));
	
}

/*@Scheduled(cron = "0 28 11 ? * *")    //使用cron来在某一时刻开启任务
public void fixTimeExecution() {
	System.out.println("at specified time " + dataFormat.format(new Date())+"execute");
}*/

}
