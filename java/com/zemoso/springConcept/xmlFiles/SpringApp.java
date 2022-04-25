package com.zemoso.springConcept.xmlFiles;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = context.getBean("myCoach",Coach.class);
        System.out.println(coach.getTraining());
        System.out.println(coach.getDailyFortune());
        context.close();
    }
}
