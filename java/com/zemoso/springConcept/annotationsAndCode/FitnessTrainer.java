package com.zemoso.springConcept.annotationsAndCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("fitness")
@Component          //default beanID
public class FitnessTrainer implements Trainer{
    @Autowired
    @Qualifier("calorieExplicit")
    private DietPlan dietPlan;

//    public FitnessTrainer(DietPlan dietPlan){
//        this.dietPlan= dietPlan;
//    }
    @Override
    public String workout() {
        return "Do 20 push ups";
    }

    @Override
    public String getDiet() {
        return dietPlan.getPlan();
    }
}
