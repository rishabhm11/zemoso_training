package com.zemoso.springConcept;

public class TrackCoach implements Coach{
    private FortuneService fortuneService;
    public TrackCoach(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }
    @Override
    public String getTraining() {
        return "Do 4 laps of 400 meters";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
