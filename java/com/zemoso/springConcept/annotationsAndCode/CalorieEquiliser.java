package com.zemoso.springConcept.annotationsAndCode;

public class CalorieEquiliser implements DietPlan{
    @Override
    public String getPlan() {
        return "You can have 2300 calories for maintaining the weight";
    }
}
