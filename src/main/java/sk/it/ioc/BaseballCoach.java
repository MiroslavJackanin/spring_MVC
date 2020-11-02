package sk.it.ioc;

import sk.it.di.FortuneService;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Dead-lifts";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
