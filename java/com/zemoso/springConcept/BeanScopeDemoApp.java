package com.zemoso.springConcept;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context=
                new ClassPathXmlApplicationContext("beanLifecycle_applicationContext.xml");
        Coach coach= context.getBean("myCoach", Coach.class);
        Coach coach1= context.getBean("myCoach", Coach.class);
        boolean result= (coach==coach1);
//        System.out.println(result);
//        System.out.println("coach memory location"+ coach);
//        System.out.println("coach1 memory location"+ coach1);
        System.out.println(coach.getTraining());
    }
}
