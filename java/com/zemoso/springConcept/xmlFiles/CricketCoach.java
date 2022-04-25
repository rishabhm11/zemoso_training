package com.zemoso.springConcept.xmlFiles;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String email;
    private String team;
    public CricketCoach(){
        System.out.println("Inside no-arg constructor");
    }

    public String getTraining() {
        return "Practice fielding";
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Inside setter");
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("Inside setter");
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Inside setter");
        this.team = team;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
