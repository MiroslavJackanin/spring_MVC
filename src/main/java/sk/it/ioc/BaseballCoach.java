package sk.it.ioc;

public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Dead-lifts";
    }
}
