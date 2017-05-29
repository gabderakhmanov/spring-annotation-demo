package com.team.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by maxim on 5/28/17.
 */
public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(theCoach.getDailyFortune());
    }
}
