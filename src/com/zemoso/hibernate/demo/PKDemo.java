package com.zemoso.hibernate.demo;

import com.zemoso.hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PKDemo {
    public static void main(String[] args){
        SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
        Session session= factory.getCurrentSession();
        try{
            System.out.println("Creating 4 new student object...");
            Student temp1=new Student("Chris","Evans","chris99@hotamil.com");
            Student temp2=new Student("Bruce","Wayne","wayne@hotamil.com");
            Student temp3=new Student("Chris","Rock","rock1@hotamil.com");
            Student temp4=new Student("Tony","Stark","tony@hotamil.com");
            session.beginTransaction();
            System.out.println("saving");
            session.save(temp1);
            session.save(temp2);
            session.save(temp3);
            session.save(temp4);
            System.out.println("saved");
            session.getTransaction().commit();
            System.out.println("Done!");
        }
        finally {
            factory.close();
        }
    }
}
