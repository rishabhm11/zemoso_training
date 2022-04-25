package com.zemoso.springConcept.annotationsAndCode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("sport.properties")
//@ComponentScan
public class Config {
    @Bean
    public DietPlan calorieEquiliser(){
        return new CalorieEquiliser();
    }
    @Bean
    public Trainer zumbaTrainer(){
        return new ZumbaTrainer(calorieEquiliser());
    }

}
