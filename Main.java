package com.taskscheduler;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.taskexecutor.TEConfig;

public class Main {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TSchConfig.class);
}
}
