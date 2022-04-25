package com.zemoso.springConcept.annotationsAndCode;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext1.xml");
        Trainer trainer= context.getBean("fitnessTrainer",Trainer.class);
        System.out.println(trainer.workout());
        System.out.println(trainer.getDiet());
        context.close();

    }
}
