package sk.it.di;

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Your fortune";
    }
}
