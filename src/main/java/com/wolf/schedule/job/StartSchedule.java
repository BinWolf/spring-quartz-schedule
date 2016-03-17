package com.wolf.schedule.job;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class StartSchedule
{
    public static void main( String[] args )
    {
        new ClassPathXmlApplicationContext("classpath:wolf-schedule-init.xml");
        System.out.println("Schedule Job initialized.");
    }
}
