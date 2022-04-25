package com.zemoso.springConcept.annotationsAndCode;

import org.springframework.stereotype.Component;

@Component
public class CalorieDeficiet implements DietPlan {
    @Override
    public String getPlan() {
        return "1500 calories for weight loss";
    }
}
