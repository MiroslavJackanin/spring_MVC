package sk.it.ioc;

import sk.it.di.FortuneService;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {}

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "2 min. sprint";
    }

    @Override
    public String getDailyFortune() {
        return "track " + fortuneService.getFortune();
    }
}
