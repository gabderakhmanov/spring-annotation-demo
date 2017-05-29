package com.team.springdemo;

import org.springframework.stereotype.Component;

/**
 * Created by maxim on 5/29/17.
 */
@Component
public class RandomFortuneService implements FortuneSevice {
    @Override
    public String getDailyFortune() {
        return "Random Fortune for you";
    }
}
