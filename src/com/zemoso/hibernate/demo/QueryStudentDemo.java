package com.zemoso.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.zemoso.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();

		List<Student> theStudents =null;
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			theStudents=session.createQuery("from Student").list();
			displayStudents(theStudents);
//			theStudents = session.createQuery("from Student s where s.lastName='Rock'").list();
//			System.out.println("\n\nStudents who have last name of Rock");
//			displayStudents(theStudents);
//			theStudents =
//					session.createQuery("from Student s where"
//							+ " s.lastName='Wayne' OR s.firstName='Tony'").list();
//			System.out.println("\n\nStudents who have last name of Wayne OR first name Tony");
//			displayStudents(theStudents);
//			theStudents = session.createQuery("from Student s where"
//					+ " s.email LIKE '%hotmail.com'").list();
//			System.out.println("\n\nStudents whose email ends with hotmail.com");
//			displayStudents(theStudents);
			session.getTransaction().commit();
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student temp : theStudents) {
			System.out.println(temp);
		}
	}

}





