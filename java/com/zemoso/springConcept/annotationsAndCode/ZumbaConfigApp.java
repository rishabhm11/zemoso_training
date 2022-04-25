package com.zemoso.springConcept.annotationsAndCode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ZumbaConfigApp {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(Config.class);
        ZumbaTrainer trainer= context.getBean("zumbaTrainer",ZumbaTrainer.class);
        System.out.println(trainer.workout());
        System.out.println(trainer.getDiet());
        System.out.println(trainer.getEmail());
        System.out.println(trainer.getTeam());
        context.close();

    }
}
