package com.zemoso.springConcept.annotationsAndCode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigApp {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(Config.class);
        Trainer trainer= context.getBean("fitnessTrainer",Trainer.class);
        System.out.println(trainer.workout());
        System.out.println(trainer.getDiet());
        context.close();

    }
}
