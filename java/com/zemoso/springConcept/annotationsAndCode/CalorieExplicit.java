package com.zemoso.springConcept.annotationsAndCode;

import org.springframework.stereotype.Component;

@Component
public class CalorieExplicit implements DietPlan{

    @Override
    public String getPlan() {
        return "Have 3000 calories for weight gain";
    }
}
