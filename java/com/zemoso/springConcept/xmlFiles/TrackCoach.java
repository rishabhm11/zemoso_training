package com.zemoso.springConcept.xmlFiles;

public class TrackCoach implements Coach {
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
    public void doMyStartUpStuff(){
        System.out.println("inside startup");
    }
    public void doMyCleanUpStuff(){
        System.out.println("inside cleanup");
    }
}
