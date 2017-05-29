package com.team.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by maxim on 5/28/17.
 */
@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneSevice fortuneService;

    @Override
    public String getDailyWorkout() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("run doMyStartupStuff method");
    }

    @PreDestroy
    public void doMyCleanStuff(){
        System.out.println("run doMyCleanStuff");
    }

}
