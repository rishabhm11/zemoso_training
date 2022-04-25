package com.zemoso.springConcept.annotationsAndCode;

import org.springframework.beans.factory.annotation.Value;

public class ZumbaTrainer implements Trainer{

    private DietPlan dietPlan;
    @Value("${foo.team}")
    private String team;
    @Value("${foo.email}")
    private String email;

    public ZumbaTrainer(DietPlan dietPlan){
        this.dietPlan=dietPlan;
    }

    public String getTeam() {
        return team;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String workout() {
        return "do 10 minutes of warm up";
    }

    @Override
    public String getDiet() {
        return dietPlan.getPlan();
    }
}
