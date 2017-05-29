package com.team.springdemo;

import org.springframework.stereotype.Component;

/**
 * Created by maxim on 5/28/17.
 */
@Component
public class HappyFortuneService implements FortuneSevice {

    @Override
    public String getDailyFortune() {
        return "Today is your lucky day";
    }
}
