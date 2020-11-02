package sk.it.di;

import sk.it.ioc.Coach;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String team;

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: inside the setter method");
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("setting mail");
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("setting team");
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "cricket workout";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
